public class Empleado {
    // Declaro variables en la clase
    public String nombre;
    public int edad;
    public double salario;

    // Declaro un metodo
    public double calculaISR(){
        double isr = salario * 30 * 0.15;
        return isr;
    }
}
