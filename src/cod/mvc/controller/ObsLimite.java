package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObsLimite implements Observer {
    final int LIMITE = 120;
    @Override
    public void update(Coche coche, Model model) {
        if (coche.velocidad > LIMITE) {
            System.out.println("[OberverLimite] ¡Cuidado! ¡Vas a " + coche.velocidad + " km/h!");
            model.cambiarVelocidad(coche.matricula, LIMITE);
            System.out.println("[OberverLimite] Velocidad limitada a " + LIMITE + " km/h");
        }
    }
}