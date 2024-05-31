package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObsLimite implements Observer {
    final int LIMITE = 120;
    @Override
    public void update(Coche coche, Model model) {
        if (coche.velocidad > LIMITE) {
            System.out.println("[OberverLimite] ¡Cuidado! ¡Vas a " + coche.velocidad + " km/h!");
            model.cambiarVelocidad(coche.matricula, LIMITE, model);
            System.out.println("[OberverLimite] Velocidad limitada a " + LIMITE + " km/h");
        }
    }

    /**
     * Ver un coche
      * @param coche Coche
     */
    @Override
    public void verCoche(Coche coche) {
        System.out.println("[OberverLimite] Coche: " + coche.matricula + " a " + coche.velocidad + " km/h");
    }
}