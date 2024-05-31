package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class Controller extends ObsVelocidad {
    private final Model MODEL;
    public Controller(Model model) {
        this.MODEL = model;
        ObsVelocidad obsservoVelocidad = new ObsVelocidad();
        model.addObserver(obsservoVelocidad);
    }

    /**
     * Crea un coche
     * @param nombre del coche
     * @param matricula del coche
     */
    public void crearCoche(String nombre, String matricula) {
        MODEL.crearCoche(nombre, matricula);
    }

    public void cambiarVelocidad(String matricula, Integer velocidad, Model model) {
        MODEL.cambiarVelocidad(matricula, velocidad, model);
    }

    /**
     * Ver un coche
     * @param coche Coche
     */
    public void verCoche(Coche coche) {
        MODEL.verCoche(coche);
    }
}