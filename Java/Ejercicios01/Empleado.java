public class Empleado {
    private String nombre;
    private double salario;
    private Fecha fecNac;

    public Empleado(String nombre, double salario, Fecha fecNac){
        this.nombre = nombre;
        this.salario = salario;
        this.fecNac = fecNac;
    }

    public Empleado(){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setFecNac(Fecha fecNac) {
        this.fecNac = fecNac;
    }

    public Fecha getFecNac() {
        return fecNac;
    }

    public double calcQuincena(){
        return salario * 15;
    }
}
