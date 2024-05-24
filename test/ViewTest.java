import cod.mvc.view.View;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewTest {

    /**
     * Prueba la visualización de la velocidad de un coche
     */
    @Test
    public void muestraVelocidad() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        View.muestraVelocidad("1234-ABC", 100);
        String expectedOutput = "The speed of car 1234-ABC is 100\n";

        assertEquals(expectedOutput, outContent.toString());
    }

    /**
     * Prueba la visualización de la velocidad de un coche con velocidad negativa
     */
    @Test
    public void muestraVelocidadNegativa() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        View.muestraVelocidad("1234-ABC", -100);
        String expectedOutput = "The speed of car 1234-ABC is -100\n";

        assertEquals(expectedOutput, outContent.toString());
    }

    /**
     * Prueba la visualización de la velocidad de un coche con matrícula vacía
     */
    @Test
    public void muestraVelocidadMatriculaVacia() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        View.muestraVelocidad("", 100);
        String expectedOutput = "The speed of car  is 100\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}