import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Ingresa un numero entero: ");
        n = scanner.nextInt();
        
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }

        scanner.close();
    }
}