public class Gerente extends Licenciado {
    private double bono;

    public Gerente(String nombre, double salario, Fecha fecNac, String depto,double bono){
        super(nombre, salario, fecNac, depto);
        this.bono = bono;
    }

    public Gerente(){}

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }
}
