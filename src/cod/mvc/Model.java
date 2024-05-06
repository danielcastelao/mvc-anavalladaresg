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
     * @return Coche creado
     */
    public static Coche crearCoche(String matricula, String modelo, int velocidad) {
        Coche c = new Coche(matricula, modelo, velocidad);
        parking.add(c);
        return c;
    }

    /**
     * Busca un coche en el parking por su matrícula
     *
     * @param matricula Matrícula del coche a buscar
     * @return Coche encontrado o null si no existe
     */
    public static Coche getCoche(String matricula) {
        for (Coche c : parking) {
            if (c.getMatricula().equals(matricula)) {
                return c;
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
    public static Integer cambiarVelocidad(String matricula, int velocidad) {
        Coche c = getCoche(matricula);
        if (c != null) {
            c.setVelocidad(velocidad);
            return velocidad;
        }
        return null;
    }

    /**
     * Obtiene la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @return Velocidad del coche o -1 si no existe
     */
    public static int getVelocidad(String matricula) {
        Coche c = getCoche(matricula);
        if (c != null) {
            return c.getVelocidad();
        }
        return -1;
    }

}