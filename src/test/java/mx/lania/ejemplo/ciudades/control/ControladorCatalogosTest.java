package mx.lania.ejemplo.ciudades.control;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author jaguilar
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControladorCatalogosTest {

    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    private String puerto;

    private static String urlBase;
    
    @Before
    public void prepararUrl() {
        this.urlBase = "http://localhost:" + puerto;
    }

    
    @Test
    public void testGetPaises() {
        //LOGGER.debug("testGetPaises");
        String resultado = restTemplate.getForObject(this.urlBase + "/countries", String.class);
        Assertions.assertThat(resultado)
                .startsWith("[{")
                .endsWith("}]")
                .contains("Antigua");
    }

    
}
