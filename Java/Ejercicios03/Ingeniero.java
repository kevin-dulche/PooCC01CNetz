public class Ingeniero extends Empleado {
    private String area;
    
    public Ingeniero(String name, double salary, Date fecNac, String area){
        super(name, salary, fecNac);
        this.area = area;
    }

    public Ingeniero(){}

    public void setArea(String area){
        this.area = area;
    }

    public String getArea(){
        return area;
    }

    public double calcQuincena(){
        return super.getSalary() * 15 * 8;
    }
}