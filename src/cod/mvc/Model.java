package cod.mvc;

import java.util.ArrayList;

public class Model {

    /**
     * Lista de coches en el parking
     */
    private static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo añade al parking
     *
     * @param matricula Matrícula del coche
     * @param modelo    Modelo del coche
     * @param velocidad Velocidad del coche
     */
    public static void crearCoche(String matricula, String modelo, int velocidad) {
        Coche coche = new Coche(matricula, modelo, velocidad);
        parking.add(coche);
    }

    /**
     * Busca un coche en el parking por su matrícula
     *
     * @param matricula Matrícula del coche a buscar
     * @return Coche encontrado o null si no existe
     */
    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @param velocidad Nueva velocidad
     */
    public static void cambiarVelocidad(String matricula, int velocidad) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(velocidad);
        }
    }

    /**
     * Obtiene la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @return Velocidad del coche o -1 si no existe
     */
    public static int getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return -1;
    }

}