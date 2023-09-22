public class LabVehicular {
    public static void main(String[] args) {
        //a. crea un objeto de la clase vheiculo
        //NO se pueden crear objetos de las clases abstractas

        //b. crea un objeto de las clases Heredadas (subclase)

        Motocicleta m1 = new Motocicleta();
        //iniciando desde los setters

        m1.setNumSerie("2135B4A");
        m1.setPeso(200);
        m1.setCc(200);

        //imprime a consola los getters

        System.out.println("Resultado del Laboratorio Mike ");
        System.out.println("Num de Serie :" + m1.getNumSerie());
        System.out.println("Peso         :" + m1.getPeso());
        System.out.println("CC           :" + m1.getCc());
        System.out.println("Friccion     :" + m1.calcFriccion() );
        System.out.println("Resistencia  :" + m1.calcResistencia());

    }
}
