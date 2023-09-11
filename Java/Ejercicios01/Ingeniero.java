public class Ingeniero extends Empleado{
    private String area;

    public Ingeniero(String nombre, double salario, Fecha fecNac, String area){
        super(nombre, salario, fecNac);
        this.area = area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
}
