public class Celular implements EvaluaNumero{
    private String numero;
    private String marca;
    private double precio;

    public Celular(String numero, String marca, double precio){
        this.numero = numero;
        this.marca = marca;
        this.precio = precio;
    }

    public Celular(){}

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public double calculaIVA(){
        return precio * 0.15;
    }

    public int calculaRegion(){
        int numReg = Integer.parseInt(numero);
        if (numReg < 100000) {
            return 1;
        } else if (numReg < 200000) {
            return 2;
        } else {
            return 3;
        }
    }

    public void imprimeNumero(){
        System.out.println("Mi numero es: " + numero);
    }
}