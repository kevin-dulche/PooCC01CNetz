import java.util.Scanner;

public class Herencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ingeniero[] Inges = new Ingeniero[3];
        for (int i = 0; i < Inges.length; i++) {

            Inges[i] = new Ingeniero();

            System.out.printf("Ingresa el nombre del ingeniero %d: ", i+1);
            String nombre = scanner.nextLine();
            Inges[i].setName(nombre);

            System.out.printf("Ingresa el salario diario de %s: ", Inges[i].getName());
            double salary = scanner.nextDouble();
            Inges[i].setSalary(salary);

            System.out.printf("Ingrese la fecha de nacimiento de %s\n", Inges[i].getName());
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Mes: ");
            int mes = scanner.nextInt();
            System.out.print("Anio: ");
            int anio = scanner.nextInt();
            Date fecha = new Date(dia, mes, anio);
            Inges[i].setFecNac(fecha);

            System.out.printf("Ingresa el area de %s: ", Inges[i].getName());
            String area = scanner.next();
            Inges[i].setArea(area);

            scanner.nextLine();
        }

        scanner.close();
        imprimir(Inges);

    }

    public static void imprimir(Ingeniero[] Inges){
        for (Ingeniero ingeniero : Inges) {
            System.out.println("*************************************");
            System.out.println("Nombre              : " + ingeniero.getName());
            System.out.println("Salario             : " + ingeniero.getSalary());
            System.out.println("Fecha de nacimiento : " + ingeniero.getFecNac().getDay() + "/" + ingeniero.getFecNac().getMounth() + "/" + ingeniero.getFecNac().getYear());
            System.out.println("Quincena            : " + ingeniero.calcQuincena());
            System.out.println("Area                :" + ingeniero.getArea());
        }
    }
}
