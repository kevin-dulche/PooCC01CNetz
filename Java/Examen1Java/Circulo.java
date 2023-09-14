public class Circulo{
    private Punto centro;
    private double radio;

    public Circulo() {}

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return 3.1416 * (radio * radio);
    }
}