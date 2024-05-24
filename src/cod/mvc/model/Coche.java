package cod.mvc.model;

public class Coche {
    public String matricula;
    public String modelo;
    public int velocidad;

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
    }
}