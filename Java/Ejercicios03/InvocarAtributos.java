public class InvocarAtributos {
    public static void main(String[] args) {
        // Creacion del objeto
        AlcanceAtributos aa = new AlcanceAtributos();
        aa.atributoPublico = "1111";
        aa.inicializaAP("2222");
        System.out.println("APublico    : " + aa.atributoPublico);
        System.out.println("APrivado    : " + aa.obtenerAP());

        AlcanceAtributos ab = new AlcanceAtributos("3333");
        System.out.println("APrivado    : " + ab.obtenerAP());
    }
}