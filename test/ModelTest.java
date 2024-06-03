import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {
    private Model model;

    @BeforeEach
    void configurar() {
        model = new Model();
        Model.crearCoche("1234-ABC", "Model S");
    }

    @Test
    public void deberiaIncrementarVelocidadDelCoche() {
        Model.cambiarVelocidad("1234-ABC", 100, model);
        Model.subirVelocidad("1234-ABC", 50, model);
        Coche c = Model.getCoche("1234-ABC");
        assert c != null;
        assertEquals(150, c.velocidad);
    }

    @Test
    public void deberiaDecrementarVelocidadDelCoche() {
        Model.subirVelocidad("1234-ABC", 100, model);
        Model.bajarVelocidad("1234-ABC", 50, model);
        Coche c = Model.getCoche("1234-ABC");
        assert c != null;
        assertEquals(50, c.velocidad);
    }

    @Test
    public void noDeberiaCambiarVelocidadDeCocheInexistente() {
        Model.cambiarVelocidad("0000-XXX", 150, model);
        Coche c = Model.getCoche("0000-XXX");
        assertNull(c);
    }

    @Test
    public void noDeberiaIncrementarVelocidadDeCocheInexistente() {
        Model.subirVelocidad("0000-XXX", 50, model);
        Coche c = Model.getCoche("0000-XXX");
        assertNull(c);
    }

    @Test
    public void noDeberiaDecrementarVelocidadDeCocheInexistente() {
        Model.bajarVelocidad("0000-XXX", 50, model);
        Coche c = Model.getCoche("0000-XXX");
        assertNull(c);
    }

    @Test
    public void deberiaRetornarMenosUnoParaVelocidadDeCocheInexistente() {
        int v = Model.getVelocidad("0000-XXX");
        assertEquals(-1, v);
    }
}