public class Punto {
    private double refX;
    private double refY;

    public Punto() {}

    public Punto(double refX, double refY) {
        this.refX = refX;
        this.refY = refY;
    }

    public void setRefX(double refX) {
        this.refX = refX;
    }

    public double getRefX() {
        return refX;
    }

    public void setRefY(double refY) {
        this.refY = refY;
    }

    public double getRefY() {
        return refY;
    }
}