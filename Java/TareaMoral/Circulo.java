public class Circulo extends Figuras{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public Circulo(){}

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calculaArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * radio;
    }

    public void imprimeFigura(){
        System.out.println("***********************************");
        System.out.println("Figura  : Circulo");
        System.out.println("Radio   : " + getRadio());
        System.out.println("Area    : " + String.format("%.2f", calculaArea()));
        System.out.println("Perimetro / Circunferencia: " + String.format("%.2f", calculaPerimetro()));
    }
}