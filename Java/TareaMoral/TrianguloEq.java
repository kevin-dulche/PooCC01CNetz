public class TrianguloEq {
    private double base;
    private double altura;

    public TrianguloEq(double base){
        this.base = base;
    }

    public TrianguloEq(){}

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        altura = Math.sqrt(Math.pow(base, 2) - Math.pow(base / 2, 2));
        return altura;
    }

    public double calculaArea(){
        return (base * altura) / 2;
    }

    public double calculaPerimetro(){
        return base * 3;
    }

    public void imprimeFigura(){
        System.out.println("***********************************");
        System.out.println("Figura      : Triangulo");
        System.out.println("Base        : " + getBase());
        System.out.println("Altura      : " + String.format("%.2f", getAltura()));
        System.out.println("Area        : " + String.format("%.2f", calculaArea()));
        System.out.println("Perimetro   : " + String.format("%.2f", calculaPerimetro()));
    }

}
