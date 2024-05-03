package cod.mvc;

public class View {
    /**
     * Muestra la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @param velocidad Velocidad del coche
     */
    public void muestraVelocidad(String matricula, int velocidad) {
        System.out.println("The speed of car " + matricula + " is " + velocidad);
    }
}