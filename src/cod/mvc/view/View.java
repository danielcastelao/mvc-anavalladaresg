package cod.mvc.view;

import cod.mvc.model.Coche;

public class View {
    /**
     * Muestra la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @param velocidad Velocidad del coche
     * @return true si se ha mostrado la velocidad
     */
    public static boolean muestraVelocidad(String matricula, Integer velocidad) {
        System.out.println("The speed of car " + matricula + " is " + velocidad);
        return true;
    }

    /**
     * Muestra un coche
     *
     * @param coche Coche a mostrar
     */
    public void mostrarCoche(Coche coche) {
        if (coche != null) {
            System.out.println("Matrícula: " + coche.matricula);
            System.out.println("Modelo: " + coche.modelo);
            System.out.println("Velocidad: " + coche.velocidad);
        } else {
            System.out.println("No se encontró el coche.");
        }
    }
}