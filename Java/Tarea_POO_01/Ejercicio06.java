import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un valor de un dado (1 al 6): ");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("El lado contrario es: 6");
                break;
            
            case 2:
                System.out.println("El lado contrario es: 5");
                break;
            
            case 3:
                System.out.println("El lado contrario es: 4");
                break;
            
            case 4:
                System.out.println("El lado contrario es: 3");
                break;

            case 5:
                System.out.println("El lado contrario es: 2");
                break;

            case 6:
                System.out.println("El lado contrario es: 1");
                break;
            
            default:
                System.out.println("ERROR: Numero incorrecto");
                break;
        }

        scanner.close();
    }
}