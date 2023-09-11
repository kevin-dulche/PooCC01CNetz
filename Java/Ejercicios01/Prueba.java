public class Prueba {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Karla", 300, new Fecha(1, 1, 2001));
        Licenciado lic = new Licenciado("Juan", 250, new Fecha(2, 2, 2002), "ventas");
        Gerente ger = new Gerente("Dany", 600, new Fecha(3, 3, 2003), "desarrollo", 3000);
        Empleado[] emps = new Empleado[3];
        emps[0] = emp;
        emps[1] = lic;
        //emps[2] = new Fecha(4, 4, 2004); Type mismatch: cannot convert from Fecha to Empleado // ERROR
        emps[2] = ger;
        System.out.println("Nombre: " + emps[0].getNombre());
    }
}
