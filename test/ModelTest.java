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
}