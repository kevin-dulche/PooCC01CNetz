public class AgenciaSM {
    public static void main(String[] args) {
        // Crear un objeto de tipo automovil
        Automovil a1 = new Automovil();

        // Inicializar datos del objeto
        a1.modelo = "Prius";
        a1.precio = 350000;
        a1.anio = 2022;

        // Impresion
        System.out.println("Modelo      : " + a1.modelo);
        System.out.println("Precio      : " + a1.precio);
        System.out.println("Anio        : " + a1.anio);
        boolean res = a1.verifica(2023);
        System.out.println("Verifica    : " + res + "\n");

        Automovil a2 = new Automovil("Chevy", 70000);
        System.out.println("Modelo      : " + a2.modelo);
        System.out.println("Precio      : " + a2.precio);
        System.out.println("Anio        : " + a2.anio);
        boolean res2 = a2.verifica(2023);
        System.out.println("Verifica    : " + res2);
    }
}
