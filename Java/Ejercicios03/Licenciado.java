public class Licenciado extends Empleado{
    private String depto;

    public Licenciado(String nombre, double salario, Date fecNac, String depto){
        super(nombre, salario, fecNac);
        this.depto = depto;
    }

    public Licenciado(){}

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }

    public double calcQuincena(){
        return super.getSalary() * 15 * 7;
    }
}