// Clase
public class Automovil {
    // Atributos
    public String modelo;
    public double precio;
    public int anio;

    // Constructor
    public Automovil(String modelo, double precio){
        this.modelo = modelo;
        this.precio = precio;
        this.anio = 2023;
    }

    public Automovil() {}

    // Metodo
    public boolean verifica(int anioAct) {
        int verif = anioAct - anio;
        if (verif < 2)
            return false;
        return true;
    }
}