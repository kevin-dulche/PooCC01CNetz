import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double estatura;
        double peso;
        int edad;
        double IMC;

        System.out.print("Ingresa la estatura: ");
        estatura = scanner.nextDouble();
        System.out.print("Ingresa el peso: ");
        peso = scanner.nextDouble();
        System.out.print("Ingresa la edad: ");
        edad = scanner.nextInt();

        IMC = peso / (estatura * estatura);

        if (IMC < 22.0 && edad < 45) {
            System.out.println("Riesgo bajo de enfermedades coronarias");
        } else {
            if (IMC < 22.0 && edad >= 45) {
                System.out.println("Riesgo medio de enfermedades coronarias");
            } else {
                if (IMC >= 22.0 && edad < 45) {
                    System.out.println("Riesgo medio de enfermedades coronarias");
                } else {
                    System.out.println("Riesgo alto de enfermedades coronarias");
                }
            }
        }
        
        scanner.close();
    }
}