package cod.mvc.controller;

import cod.mvc.model.Coche;

public class ObsLimite implements Observer {
    final int LIMITE = 120;
    @Override
    public void update(Coche coche) {
        if (coche.velocidad > LIMITE) {
            System.out.println("[OberverLimite] ¡Cuidado! ¡Vas a " + coche.velocidad + " km/h!");
        }
    }
}