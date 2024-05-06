import cod.mvc.Coche;
import cod.mvc.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {

    @BeforeEach
    void setUp() {
        Model.crearCoche("1234-ABC", "Model S", 100);                    // Assuming there's a method to add cars
    }

    /**
     * Comprueba que puedes añadir un coche al parking
     */
    @Test
    public void shouldAddCarToParking() {
        assertNotNull(Model.getCoche("1234-ABC"));
    }

    /**
     * Prueba la búsqueda de un coche existente
     */
    @Test
    void getCocheExistente() {
        Coche c = Model.getCoche("1234-ABC");
        assertNotNull(c);
        assertEquals("1234-ABC", c.getMatricula());
    }

    /**
     * Prueba la búsqueda de un coche no existente
     */
    @Test
    void getCocheNoExistente() {
        Coche c = Model.getCoche("0000-XXX");
        assertNull(c);
    }

    /**
     * Prueba el cambio de velocidad de un coche existente
     */
    @Test
    void cambiarVelocidadCocheExistente() {
        Model.cambiarVelocidad("1234-ABC", 150);
        Coche c = Model.getCoche("1234-ABC");
        assertEquals(150, c.getVelocidad());
    }

    /**
     * Prueba el cambio de velocidad de un coche no existente
     */
    @Test
    void cambiarVelocidadCocheNoExistente() {
        Model.cambiarVelocidad("0000-XXX", 150);
        Coche c = Model.getCoche("0000-XXX");
        assertNull(c);
    }

    /**
     * Prueba la obtención de la velocidad de un coche existente
     */
    @Test
    void getVelocidadCocheExistente() {
        int v = Model.getVelocidad("1234-ABC");
        assertEquals(100, v);
    }

    /**
     * Prueba la obtención de la velocidad de un coche no existente
     */
    @Test
    void getVelocidadCocheNoExistente() {
        int v = Model.getVelocidad("0000-XXX");
        assertEquals(-1, v);
    }
}