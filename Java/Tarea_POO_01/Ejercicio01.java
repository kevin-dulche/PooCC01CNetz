import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p, q;

        System.out.print("Dame el valor (entero) de p: ");
        p = scanner.nextInt();
        System.out.print("Dame el valor (entero) de q: ");
        q = scanner.nextInt();

        if (q == 0) {
            System.out.println("error, division por cero");
        } else {
            int c = 0;
            int r = p;
            while (r >= q) {
                r = r - q;
                c = c - 1;
            }
            System.out.println("Valor de c: " + c + ", Valor de r: " + r);
        }
        
        scanner.close();
    }
}