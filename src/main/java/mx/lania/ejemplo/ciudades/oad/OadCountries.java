package mx.lania.ejemplo.ciudades.oad;

import java.util.List;
import mx.lania.ejemplo.ciudades.entidades.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jaguilar
 */
public interface OadCountries extends JpaRepository<Country, String>{

    public List<Country> findByNameContainingIgnoreCase(String nombre);
    
}
