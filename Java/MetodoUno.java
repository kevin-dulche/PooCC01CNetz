public class MetodoUno {
    public static void main(String[] args) {
        // Quiero invocar un metodo (modulo)
        System.out.println("Estoy en el main");
        
        // Aquí se llama al metodo
        miMetodo();
        System.out.println("Fin del Main");
    }

    // Metodo
    static void miMetodo() {
        System.out.println("Estoy en mi Metodo");
    }
}
