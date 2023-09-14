public class Fabrica {
    public static void main(String[] args) {
        Fecha fechaUno = new Fecha(12, 8, 2003);

        Fecha fechaDos = new Fecha(); 
        fechaDos.setDia(29);
        fechaDos.setMes(8);
        fechaDos.setAnio(1986);

        Empleado emp1 = new Empleado();
        emp1.setFecNac(fechaUno);
        emp1.setNombre("Kevin");
        emp1.setSalario(324.75);

        System.out.println("Nombre      : " + emp1.getNombre());
        System.out.println("Fecha de Nac: " + emp1.getFecNac().getDia() + " " + emp1.getFecNac().getMes() + " " + emp1.getFecNac().getAnio());
        System.out.println("Salario     : " + emp1.getSalario());
        
        System.out.println("Quincena    : " + emp1.calculaQuincena());

        System.out.println("Dia         : " + fechaDos.getDia());
        System.out.println("Mes         : " + fechaDos.getMes());
        System.out.println("Anio        : " + fechaDos.getAnio());

        fechaDos.imprimeFecha();
    }
}