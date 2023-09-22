public abstract class Vehiculo {
    // Atributos
    private String numSerie;
    private double peso;
    
    // Constructores
    public Vehiculo(String numSerie, double peso){
        this.numSerie = numSerie;
        this.peso = peso;
    }

    public Vehiculo(){}

    // Metodos abstractos
    public abstract double calcFriccion();
    public abstract double calcResistencia();

    // Setteres y getters
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}