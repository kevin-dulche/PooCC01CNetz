import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        int suma = 0;
        int resultado;

        System.out.print("Dame el valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Dame el valor de n: ");
        int n = scanner.nextInt();

        while (k <= n) {
            resultado = 1;
            for (int i = 0; i < k; i++) {
                resultado *= x;
            }
            suma = suma + resultado;
            k = k + 1;
        }
        System.out.println("El resultado de la sumatoria es : " + suma);
        scanner.close();
    }   
}