package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.view.View;

public class ObsVelocidad implements Observer {
    /**
     * Update the observer
     * @param coche Coche
     */
    @Override
    public void update(Coche coche) {
        System.out.println();
        View.muestraVelocidad(coche.matricula, coche.velocidad);
    }
}
