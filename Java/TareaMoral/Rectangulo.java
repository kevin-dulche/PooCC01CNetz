public class Rectangulo extends Figuras{
    private double lado;

    public Rectangulo(double lado){
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calculaArea(){
        return lado * lado;
    }

    public double calculaPerimetro(){
        return lado * 4;
    }

    public void imprimeFigura(){
        System.out.println("***********************************");
        System.out.println("Figura: Rectangulo");
        System.out.println("Lado: " + getLado());
        System.out.println("Area: " + String.format("%.2f", calculaArea()));
        System.out.println("Perimetro: " + String.format("%.2f", calculaPerimetro()));
    }
}
