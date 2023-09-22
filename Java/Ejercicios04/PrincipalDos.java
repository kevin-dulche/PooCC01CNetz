public class PrincipalDos {
    public static void main(String[] args) {
        int varI;
        double varD;
        String varS;
        ClaseD clase1 = new ClaseD();
        // No se pueden hacer objetos de una calse abstracta
        // ClaseAbstracta claseAbs = new ClaseAbstracta();
        ClaseD clase2 = new ClaseD("Hola", 15.3, 16.4);
        System.out.println("atributoCA1: " + clase2.getAtributoCA1());
        System.out.println("atributoCA2: " + clase2.getAtributoCA2());
        System.out.println("atributoD1: " + clase2.getAtributoD1());
        varI = clase2.metodoD1(3, 5);
        varD = clase2.metodoD2(3.5);
        varI = clase2.metodoCA2(8.4);
        varS = clase2.metodoCA3();
    }
}