import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {

    /**
     * Comprueba que puedes añadir un coche al parking
     */
    @Test
    public void shouldAddCarToParking() {
        Model.crearCoche("1234-ABC", "Model S", 100);
        assertNotNull(Model.getCoche("1234-ABC"));
    }

    /**
     * Prueba la búsqueda de un coche existente
     */
    @Test
    void getCocheExistente() {
        Coche coche = Model.getCoche("1234-ABC");
        assertNotNull(coche);
        assertEquals("1234-ABC", coche.getMatricula());
    }

    /**
     * Prueba la búsqueda de un coche no existente
     */
    @Test
    void getCocheNoExistente() {
        Coche coche = Model.getCoche("0000-XXX");
        assertNull(coche);
    }

}