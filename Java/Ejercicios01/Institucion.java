public class Institucion {
    public static void main(String[] args) {
        Persona[] pers = new Persona[2];
        pers[0] = new Empleado("Juan", new Fecha(1, 1, 2001), 100);
        pers[1] = new Estudiante("Alex",  new Fecha(2, 2, 2002), 1234);
        System.out.println("Nombre 1: " + pers[0].getNombre());
        System.out.println("Fecha de Nacimiento: " + pers[0].getFecNac().getDia() + "/" + pers[0].getFecNac().getMes() + "/" + pers[0].getFecNac().getAnio());
        System.out.println("Salario: " + ((Empleado)pers[0]).getSalario());
        pers[0].imprimeDescripcion();
        System.out.println("Quincena: " + ((Empleado)pers[0]).calcQuincena());
        System.out.println();
    }
}