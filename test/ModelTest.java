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

    /**
     * Prueba el cambio de velocidad de un coche existente
     */
    @Test
    void cambiarVelocidadCocheExistente() {
        Model.cambiarVelocidad("1234-ABC", 150);
        Coche coche = Model.getCoche("1234-ABC");
        assertEquals(150, coche.getVelocidad());
    }

    /**
     * Prueba el cambio de velocidad de un coche no existente
     */
    @Test
    void cambiarVelocidadCocheNoExistente() {
        Model.cambiarVelocidad("0000-XXX", 150);
        Coche coche = Model.getCoche("0000-XXX");
        assertNull(coche);
    }

    /**
     * Prueba la obtención de la velocidad de un coche existente
     */
    @Test
    void getVelocidadCocheExistente() {
        int velocidad = Model.getVelocidad("1234-ABC");
        assertEquals(100, velocidad);
    }

    /**
     * Prueba la obtención de la velocidad de un coche no existente
     */
    @Test
    void getVelocidadCocheNoExistente() {
        int velocidad = Model.getVelocidad("0000-XXX");
        assertEquals(-1, velocidad);
    }
}