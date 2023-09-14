public class Empresa {
    public static void main(String[] args) {
        Ingeniero Ing1 = new Ingeniero();
        Ing1.setName("Carlos");
        Ing1.setSalary(500);
        Ing1.setFecNac(new Date(12, 3, 2003));
        Ing1.setArea("DEV");

        System.out.println("Nombre                  : " + Ing1.getName());
        System.out.println("Salario                 : " + Ing1.getSalary());
        System.out.println("Fecha day/mounth/year   : " + Ing1.getFecNac().getDay() + "/" + Ing1.getFecNac().getMounth() + "/" + Ing1.getFecNac().getYear());
        System.out.println("Quincena                : " + Ing1.calcQuincena());
        System.out.println("Area                    : " + Ing1.getArea());

        Licenciado Lic1 = new Licenciado();
        Lic1.setName("Juan");
        Lic1.setSalary(300);
        Lic1.setFecNac(new Date(15, 6, 2000));
        Lic1.setDepto("Contabilidad");

        System.out.println("\nNombre                  : " + Lic1.getName());
        System.out.println("Salario                 : " + Lic1.getSalary());
        System.out.println("Fecha day/mounth/year   : " + Lic1.getFecNac().getDay() + "/" + Lic1.getFecNac().getMounth() + "/" + Lic1.getFecNac().getYear());
        System.out.println("Quincena                : " + Lic1.calcQuincena());
        System.out.println("Departamento            : " + Lic1.getDepto());
    }
}
