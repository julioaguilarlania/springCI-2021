package mx.lania.ejemplo.ciudades.control;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.validation.Valid;
import mx.lania.ejemplo.ciudades.entidades.City;
import mx.lania.ejemplo.ciudades.entidades.Country;
import mx.lania.ejemplo.ciudades.oad.OadCities;
import mx.lania.ejemplo.ciudades.oad.OadCountries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


/**
 *
 * @author jaguilar
 */
@RestController
public class ControladorCatalogos {
    
    @Autowired
    OadCountries oadCountries;
    
    @Autowired
    OadCities oadCities;
    
    @GetMapping("/countries")
    public List<Country> getPaises() {
        return oadCountries.findAll();
    }
    
    @GetMapping("/cities/{id}")
    public ResponseEntity<City> getCiudadPorId(@PathVariable("id") Integer id) {
        Optional<City> opCiudad = oadCities.findById(id);
        if (opCiudad.isPresent()) {
            return ResponseEntity.ok(opCiudad.get());
        }
        else return ResponseEntity.notFound().build();
    }
    
    @GetMapping(value = "/cities", params = {"name"})
    public List<City> getCiudadesPorNombre(@RequestParam("name") String nombre) {
        return oadCities.findByNameStartingWithIgnoreCase(nombre);
    }
    
    @GetMapping(value = "/countries", params = {"name"})
    public List<Country> getPaisesPorNombre(@RequestParam("name") String nombre) {
        return oadCountries.findByNameContainingIgnoreCase(nombre);
    }
    
    @PostMapping("/countries")
    public ResponseEntity<Object> crearPais(
            @Valid @RequestBody Country country, 
            Errors errores) {
        if (errores.hasErrors()) {
            return new ResponseEntity<Object> (
                    errores.getFieldErrors()
                            .parallelStream()
                            .map(e -> e.getField() + ":" + e.getDefaultMessage())
                            .collect(Collectors.joining(",")),
                    HttpStatus.BAD_REQUEST);
        }
        try {
            oadCountries.save(country);
            URI newUri = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("{/id}")
                    .buildAndExpand(country.getCode())
                    .toUri();
            return ResponseEntity
                    .created(newUri)
                    .body(country);
        }
        catch (Exception ex) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ex.getMessage());
        }
    }
    
    @PutMapping("/countries/{code}")
    public ResponseEntity<Object> guardarPais(
            @Valid @RequestBody Country country, 
            @PathVariable("code") String code,
            Errors errores) {
        country.setCode(code);
        if (errores.hasErrors()) {
            return new ResponseEntity<Object> (
                    errores.getAllErrors()
                            .parallelStream()
                            .map(e -> e.getDefaultMessage())
                            .collect(Collectors.joining(":")),
                    HttpStatus.BAD_REQUEST);
        }
        try {
            oadCountries.save(country);
            return ResponseEntity.ok(country);
        }
        catch (Exception ex) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ex.getMessage());
        }
        
    }
}
