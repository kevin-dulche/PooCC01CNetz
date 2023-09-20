public class ImplementacionFiguras {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(123);
        c1.imprimeFigura();
        TrianguloEq t1 = new TrianguloEq(10);
        t1.imprimeFigura();
        Rectangulo r1 = new Rectangulo(5);
        r1.imprimeFigura();
    }
}