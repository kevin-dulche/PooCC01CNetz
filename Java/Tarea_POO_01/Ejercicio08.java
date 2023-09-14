import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("El numero " + n + " es par");
        } else {
            System.out.println("El numero " + n + " es impar");
        }

        scanner.close();
    }
}