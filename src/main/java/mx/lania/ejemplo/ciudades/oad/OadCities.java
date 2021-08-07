package mx.lania.ejemplo.ciudades.oad;

import java.util.List;
import mx.lania.ejemplo.ciudades.entidades.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jaguilar
 */
public interface OadCities extends JpaRepository<City, Integer>{

    public List<City> findByNameStartingWithIgnoreCase(String nombre);
    
}
