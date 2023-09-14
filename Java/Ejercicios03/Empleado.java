public class Empleado{
    private String name;
    private double salary;
    private Date fecNac;

    Empleado(String name, double salary, Date fecNac){
        this.name = name;
        this.salary = salary;
        this.fecNac = fecNac;
    }

    Empleado() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public double calcQuincena(){
        return salary * 15;
    }
}