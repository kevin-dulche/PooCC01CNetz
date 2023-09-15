package Examen2Java;

public class PersonalAlojamineto extends PersonasCentroVac {
    private int idPersonal;
    private double salarioSem;

    public PersonalAlojamineto(String nombre, Fecha fechaIngresoC, int idPersonal, double salarioSem){
        super(nombre, fechaIngresoC);
        this.idPersonal = idPersonal;
        this.salarioSem = salarioSem;
    }

    public PersonalAlojamineto(){}

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setSalarioSem(double salarioSem) {
        this.salarioSem = salarioSem;
    }

    public double getSalarioSem() {
        return salarioSem;
    }

    public double calculaSeguro(){
        return salarioSem * 2;
    }
}
