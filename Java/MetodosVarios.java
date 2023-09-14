import javax.swing.JOptionPane;

public class MetodosVarios {
    public static void main(String[] args) {
        // Variables
        String cadena;
        int num;
        double valorX, res;

        //  Entrada de datos
        cadena = JOptionPane.showInputDialog("Dame n:");
        num = Integer.parseInt(cadena);
        cadena = JOptionPane.showInputDialog("Dame x:");
        valorX = Double.parseDouble(cadena);

        //Llamada al metodo calculadora
        res = calcularSerie(num, valorX);

        // Salida de datos
        System.out.println("El resultado de la serie es: " + res);
    }

    // Metodos
    static double calcularSerie(int n, double x) {
        double sum = 1;
        int den = 2;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x, den)/obtenerFactorial(den);
            den += 2;
        }
        return sum;
    }
    static int obtenerFactorial(int n){
        int acum = 1;
        for (int i = 1; i <= n; i++) {
            acum = acum * i;
        }
        return acum;
    }
}