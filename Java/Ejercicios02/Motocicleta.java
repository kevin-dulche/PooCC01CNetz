
public class Motocicleta extends Vehiculo{
    private int cc;

    public Motocicleta(String nombre, double peso, int cc){
        super(nombre, peso);
        this.cc = cc;
    }
    
    public Motocicleta(){}

    public void setCc(int cc) {
        this.cc = cc;
    }
    public int getCc() {
        return cc;
    }

    @Override
    public double calcFriccion() {
        double fricc = 2*(0.123*super.getPeso());
       return fricc;
    }

    @Override
    public double calcResistencia() {
        double resis = (3.12* super.getPeso())/cc;
        return resis;
    }
    
}
