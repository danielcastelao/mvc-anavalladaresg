package cod.mvc;

public class Controller {
    public static void main(String[] args) {
        Model.crearCoche("1234ABC", "Seat", 120);
        View.muestraVelocidad("1234ABC", Model.getVelocidad("1234ABC"));
        Model.cambiarVelocidad("1234ABC", 60);
        View.muestraVelocidad("1234ABC", Model.getVelocidad("1234ABC"));
    }
}