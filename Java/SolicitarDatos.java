import javax.swing.JOptionPane;

public class SolicitarDatos {
    public static void main(String[] args) {
        // Solicitar Datos por medio de una ventana
        String cadena = JOptionPane.showInputDialog("Dame una cadena");
        // Imprimir ese dato en consola
        System.out.println("La cadena es " + cadena);
        // Solicita un valor de tipo entero
        cadena = JOptionPane.showInputDialog("Dame un valor de tipo entero:");
        int valor = Integer.parseInt(cadena);
        int sumar = valor + 10;
        System.out.println("La suma es: " + sumar);
    }
}
