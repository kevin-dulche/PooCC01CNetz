public class ArregloLicenciado {
    public static void main(String[] args) {
        // Crear un arreglo de la clase Licenciado
        Licenciado[] lics = new Licenciado[3];
        lics[0] = new Licenciado("Godin", 300, new Date(8, 1, 2000), "ventas");
        lics[1] = new Licenciado("Perez", 299, new Date(8, 3, 2000), "contabilidad");
        lics[2] = new Licenciado("Danny", 301, new Date(8, 4, 2000), "administracion");
        
        for (Licenciado licenciado : lics) {
            System.out.println("********** Consulta del Lic **********");
            System.out.println("Nombre  : " + licenciado.getName());
            System.out.println("Salario : " + licenciado.getSalary());
            System.out.println("F day   : " + licenciado.getFecNac().getDay());
            System.out.println("F mounth: " + licenciado.getFecNac().getMounth());
            System.out.println("F year  : " + licenciado.getFecNac().getYear());
            System.out.println("Depto   : " + licenciado.getDepto());
            System.out.println("Paga    : " + licenciado.calcQuincena());
        }
    }
}
