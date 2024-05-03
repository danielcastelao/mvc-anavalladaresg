package cod.mvc;

import java.util.ArrayList;

public class Model {

    private ArrayList<Coche> parking = new ArrayList<>();

    public void crearCoche(String matricula, String modelo, int velocidad) {
        Coche coche = new Coche(matricula, modelo, velocidad);
        parking.add(coche);
    }

    /**
     * Busca un coche en el parking por su matrícula
     * @param matricula Matrícula del coche a buscar
     * @return Coche encontrado o null si no existe
     */
    public Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

}