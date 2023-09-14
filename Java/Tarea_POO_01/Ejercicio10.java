import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tramo;
        int minutos = 0;

        while (true) {
            System.out.print("Duracion del tramo: ");
            tramo = scanner.nextInt();
            minutos = minutos + tramo;
            if (tramo == 0) {
                break;
            }
        }

        int horas = minutos / 60;
        int minutosFinales = minutos % 60;

        System.out.println("Tiempo total de viaje: " + horas + ":" + minutosFinales + " horas");
        scanner.close();
    }
}