public class Geometria {
    public static void main(String[] args) {
        Punto pt1 = new Punto(5, 10);
        Punto pt2 = new Punto();
        pt2.setRefX(5);
        pt2.setRefY(10);
        System.out.println("El valor de refX en pt2 es: " + pt2.getRefX());
        System.out.println("El valor de refY en pt2 es: " + pt2.getRefY());
        Circulo circ1 = new Circulo(pt2, 7);
        Circulo circ2 = new Circulo();
        circ2.setCentro(pt2);
        circ2.setRadio(7);
        System.out.println("El valor de punto de circ2 es: " + circ2.getCentro().getRefX() + ", " + circ2.getCentro().getRefY());
        System.out.println("El valor del radio es: " + circ2.getRadio());
    }
}
