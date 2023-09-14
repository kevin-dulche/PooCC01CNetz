import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numHabitacion;
        String[] habitaciones = new String[5];
        habitaciones[0] = "Azul";
        habitaciones[1] = "Roja";
        habitaciones[2] = "Verde";
        habitaciones[3] = "Rosa";
        habitaciones[4] = "Gris";

        int[] camas = new int[5];
        camas[0] = 2;
        camas[1] = 1;
        camas[2] = 3;
        camas[3] = 2;
        camas[4] = 1;

        String[] planta = new String[5];
        planta[0] = "Primera";
        planta[1] = "Primera";
        planta[2] = "Segunda";
        planta[3] = "Segunda";
        planta[4] = "Tercera";

        System.out.println("Listado de habitaciones:\n");
        System.out.println("1. " + habitaciones[0]);
        System.out.println("2. " + habitaciones[1]);
        System.out.println("3. " + habitaciones[2]);
        System.out.println("4. " + habitaciones[3]);
        System.out.println("5. " + habitaciones[4] + "\n");

        System.out.print("Introduzca el numero de habitacion: ");
        numHabitacion = scanner.nextInt();

        switch (numHabitacion) {
            case 1:
                System.out.println("La " + habitaciones[numHabitacion-1] + " tiene " + camas[numHabitacion-1] + " camas y esta en la " + planta[numHabitacion-1] + " planta");
                break;
            case 2:
                System.out.println("La " + habitaciones[numHabitacion-1] + " tiene " + camas[numHabitacion-1] + " cama y esta en la " + planta[numHabitacion-1] + " planta");
                break;
            case 3:
                System.out.println("La " + habitaciones[numHabitacion-1] + " tiene " + camas[numHabitacion-1] + " camas y esta en la " + planta[numHabitacion-1] + " planta");
                break;
            case 4:
                System.out.println("La " + habitaciones[numHabitacion-1] + " tiene " + camas[numHabitacion-1] + " camas y esta en la " + planta[numHabitacion-1] + " planta");
                break;
            case 5:
                System.out.println("La " + habitaciones[numHabitacion-1] + " tiene " + camas[numHabitacion-1] + " cama y esta en la " + planta[numHabitacion-1] + " planta");
                break;
            default:
                System.out.println("ERROR: " + numHabitacion + " no esta asociado a ninguna habitacion");
                break;
        }

        scanner.close();
    }
}