package cod.mvc;

public class Coche {
    private String matricula;
    private String modelo;
    private int velocidad;

    public Coche(String matricula, String modelo, int velocidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}