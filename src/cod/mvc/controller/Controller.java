package cod.mvc.controller;

import cod.mvc.model.Model;

/**
 * Controlador
 */
public class Controller extends ObsVelocidad {
    private final Model MODEL;

    /**
     * Constructor
     * @param model Modelo
     */
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
        Model.crearCoche(nombre, matricula);
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula del coche
     * @param velocidad del coche
     * @param model Modelo
     */
    public void cambiarVelocidad(String matricula, Integer velocidad, Model model) {
        Model.cambiarVelocidad(matricula, velocidad, model);
    }
}