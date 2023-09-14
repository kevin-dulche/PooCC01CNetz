public class ArregloEmpleado {
    public static void main(String[] args) {

        Empleado[] emps = new Empleado[3];

        Empleado emp1 = new Empleado("Kevin", 430, new Date(12,8,2003));

        Empleado emp2 = new Empleado();
        emp2.setName("Uriel");
        emp2.setSalary(340);
        emp2.setFecNac(new Date(8,12,2005));

        emps[0] = emp1;

        emps[1] = emp2;

        Empleado emp3 = new Empleado("Javier", 380, new Date(29,3,1982));
        emps[2] = emp3;

        for (Empleado empleado : emps) {
            System.out.println("**************************************************");
            System.out.println("Nombre              : " + empleado.getName());
            System.out.println("Salario             : " + empleado.getSalary());
            System.out.println("Fecha de Nacimiento : " + empleado.getFecNac().getDay() + "/" + empleado.getFecNac().getMounth() + "/" + empleado.getFecNac().getYear());
            System.out.println("Quincena            : " + empleado.calcQuincena());
        }

    }
}   