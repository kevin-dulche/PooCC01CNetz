public class Empleado {
    private String nombre;
    private Fecha fecNac;
    private double salario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecNac(Fecha fecNac) {
        this.fecNac = fecNac;
    }

    public Fecha getFecNac() {
        return fecNac;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calculaQuincena() {
        return salario * 15;
    }
}