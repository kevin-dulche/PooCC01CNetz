public class NegocioDeCelulares {
    public static void main(String[] args) {
        // Crear un celular
        Celular cel1 = new Celular();
        cel1.modelo = "Honnor";
        cel1.precio = 2499.99;
        cel1.activo = false;
        double iva = cel1.calculaIVA();
        double des = cel1.descuento(10);
        // Imprimir datos
        System.out.println("Modelo      : " + cel1.modelo);
        System.out.println("Precio      : " + cel1.precio);
        System.out.println("Activo      : " + cel1.activo);
        System.out.println("***************************");
        System.out.println("Iva         : " + iva);
        System.out.println("Descuento   : " + des);
    }
}
