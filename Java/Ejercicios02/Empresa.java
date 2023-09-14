public class Empresa {
    public static void main(String[] args) {
        // crea un objeto de tipo fecha
        Date f1 = new Date(14,2,2003);
        // crea un objeto de tipo Empleado
        Empleado e1 = new Empleado("Goku", 5600, f1);
        // crea un objeto de tipo Licenciado
        Licenciado l1 = new Licenciado();
        l1.setName("Daniel");
        l1.setSalary(15000);
        l1.setFecNac(new Date(28,2,2003));
        l1.setDepto("ventas");

        Licenciado l2 = new Licenciado("Marcos", 15000, new Date(14,3,2000), "conta");

        System.out.println("********** Consulta del Emp **********");
        System.out.println("Nombre  : " + e1.getName());
        System.out.println("Salario : " + e1.getSalary());
        System.out.println("F day   : " + e1.getFecNac().getDay());
        System.out.println("F mounth: " + e1.getFecNac().getMounth());
        System.out.println("F year  : " + e1.getFecNac().getYear());
        System.out.println("Paga    : " + e1.calcQuincena());
        
        System.out.println("********** Consulta del Lic **********");
        System.out.println("Nombre  : " + l1.getName());
        System.out.println("Salario : " + l1.getSalary());
        System.out.println("F day   : " + l1.getFecNac().getDay());
        System.out.println("F mounth: " + l1.getFecNac().getMounth());
        System.out.println("F year  : " + l1.getFecNac().getYear());
        System.out.println("Depto   : " + l1.getDepto());
        System.out.println("Paga    : " + l1.calcQuincena());

        System.out.println("********** Consulta del Lic **********");
        System.out.println("Nombre  : " + l2.getName());
        System.out.println("Salario : " + l2.getSalary());
        System.out.println("F day   : " + l2.getFecNac().getDay());
        System.out.println("F mounth: " + l2.getFecNac().getMounth());
        System.out.println("F year  : " + l2.getFecNac().getYear());
        System.out.println("Depto   : " + l2.getDepto());
        System.out.println("Paga    : " + l2.calcQuincena());
    }
}