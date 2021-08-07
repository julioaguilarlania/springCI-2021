package mx.lania.ejemplo.ciudades.control;

import java.net.URISyntaxException;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author jaguilar
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControladorCatalogosTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControladorCatalogosTest.class);

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
        LOGGER.debug("testGetPaises");
        String resultado = restTemplate.getForObject(this.urlBase + "/countries", String.class);
        Assertions.assertThat(resultado)
                .startsWith("[{")
                .endsWith("}]")
                .contains("Antigua");
    }

    @Test
    public void testGetCiudadExistente() {
        LOGGER.debug("testGetCiudadExistente");
        String resultado = restTemplate.getForObject(this.urlBase + "/cities/1", String.class);
        Assertions.assertThat(resultado)
                .startsWith("{")
                .endsWith("}")
                .contains("Kabul");
    }

    @Test
    public void testGetCiudadNoExistente() throws URISyntaxException {
        LOGGER.debug("testGetCiudadNoExistente");
        HttpEntity<String> peticion = new HttpEntity<>("");
        ResponseEntity<String> resultado = restTemplate.exchange(this.urlBase + "/cities/111", HttpMethod.GET, peticion, String.class);
        Assertions.assertThat(resultado.getStatusCodeValue())
                .isEqualTo(404);
    }

}
