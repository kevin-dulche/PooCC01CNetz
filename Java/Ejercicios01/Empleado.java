public class Empleado extends Persona{
    private double salario;
    
    public Empleado(String nombre, Fecha fecNac, double salario){
        super(nombre, fecNac);
        this.salario = salario;
    }

    public Empleado(){}

    public void imprimeDescripcion(){
        System.out.println("Soy una clase Empleado");
        System.out.println("Con salario: " + salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcQuincena(){
        return salario * 15;
    }
}