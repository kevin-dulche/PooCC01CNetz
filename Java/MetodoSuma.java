import javax.swing.JOptionPane;
// Este import es para poder imprimir un texto en una ventana

public class MetodoSuma {
    public static void main(String[] args) {
        // Se declaran el tipo de dato y el nombre
        String cadena;
        double valorUno, valorDos, res;
        // Vamos a crear un modulo que sume dos numeros flotantes
        cadena = JOptionPane.showInputDialog("Dame el primer valor: ");
        // El Double.parseDouble() es para pasar de cadena de string a double
        valorUno = Double.parseDouble(cadena);
        cadena = JOptionPane.showInputDialog("Dame el segundo valor: ");
        valorDos = Double.parseDouble(cadena);
        res = sumaDosValores(valorUno, valorDos);

        // El System.out.println() Se usa para imprimir una linea de texto; ya viene incluido al final un salto de linea
        System.out.println("El resultado de la suma es: " + res);
        JOptionPane.showMessageDialog(null,"Hola");
    }

    // La sintaxis de un metodo() / funcion es la siguiente
    /*static tipoDato NombreMetodo (parametros) {
        instrucciones
        instrucciones
        instrucciones
        return valor(es)
    } */
    static double sumaDosValores(double valorUno, double valorDos) {
        double resultado = valorUno + valorDos;
        return resultado;
    }
}