package cod.mvc;

import java.util.ArrayList;

public class Model {

    private ArrayList<Coche> parking = new ArrayList<>();

    public void crearCoche(String matricula, String modelo, int velocidad) {
        Coche coche = new Coche(matricula, modelo, velocidad);
        parking.add(coche);
    }
}