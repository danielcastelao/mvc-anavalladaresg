package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Model;
import cod.mvc.view.View;

public class App {
    public static void main(String[] args) {
        Model miModel = new Model();
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");
        miController.crearCoche("Aston Martin", "FGH 3333");

        // Cambiar la velocidad de un coche
        miController.cambiarVelocidad("SBC 1234", 30);

        // otro cambio de velocidad
        // sobrepasando la velocidad máxima
        miController.cambiarVelocidad("HYU 4567", 150);
    }
}
