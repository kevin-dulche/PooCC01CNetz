public class Automovil extends Vehiculo{
    private double vol;

    public Automovil(String numSerie, double peso, double vol){
        super(numSerie, peso);
        this.vol = vol;
    }

    public Automovil(){}

    public void setVol(double vol) {
        this.vol = vol;
    }

    public double getVol() {
        return vol;
    }

    @Override
    public double calcFriccion(){
        double fricc = 4 * (.324 * super.getPeso());
        return fricc;
    }

    @Override
    public double calcResistencia() {
        double resis = (2.34* super.getPeso()) / vol;
        return resis;
    }

}
