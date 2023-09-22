public class MiLocal {
    public static void main(String[] args) {
        Celular cel = new Celular();
        // EvaluaNumero en = new EvaluaNumero(){}; ERROR
        // No se pueden crear objetos de interfaces
        Celular c1 = new Celular("123300", "Samsung", 15000);
        System.out.println("Numero: " + c1.getNumero());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Precio: $" + c1.getPrecio());
        System.out.println("Iva: $" + c1.calculaIVA());
        System.out.println("Region: " + c1.calculaRegion());
        c1.imprimeNumero();
    }
}
