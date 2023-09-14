import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame el primer valor: ");
        int n = scanner.nextInt();
        System.out.print("Dame el segundo valor: ");
        int m = scanner.nextInt();

        if (n == m) {
            System.out.println("Es el mismo numero");
        } else {
            System.out.println("Los numeros entre " + n + " y " + m + " son:");
            if (n >= m) {
                while (n >= m) {
                    System.out.print(n + " ");
                    n = n - 1;
                }
            } else {
                while (m >= n) {
                    System.out.print(n + " ");
                    n = n + 1;
                }
            }
        }

        scanner.close();
    }
}