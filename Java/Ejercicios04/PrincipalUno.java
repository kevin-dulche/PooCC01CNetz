public class PrincipalUno {
    public static void main(String[] args) {
        ClaseA[] superArreglo = new ClaseA[6];
        superArreglo[0] = new ClaseA("Hola", 1, 1.5);
        superArreglo[1] = new ClaseA("Juan", 2, 2.5);
        superArreglo[2] = new ClaseB("Agua", 3, 4.6, "Fuego");
        superArreglo[3] = new ClaseB("Tierra", 8, 7.1, "Ezequiel");
        superArreglo[4] = new ClaseC("Ya", 9, 9.5, "Pedro", 53);
        superArreglo[5] = new ClaseC("Luz", 64, 42.3, "Mundo", 73);
        imprimeArreglo(superArreglo);
    }

    public static void imprimeArreglo(ClaseA[] superArreglo){
        int varI;
        double varD;
        String varS;
        for (ClaseA clases : superArreglo) {
            System.out.println("************************************************");
            if (clases instanceof ClaseA) {
                System.out.println("atributoA1 de ClaseA: " + clases.getAtributoA1());
                System.out.println("atributoA2 de ClaseA: " + clases.getAtributoA2());
                System.out.println("atributoA3 de ClaseA: " + clases.getAtributoA3());
                clases.metodoA1(1);
                clases.metodoA2(2.2);
            } else if (clases instanceof ClaseB) {
                System.out.println("atributoA1 de ClaseB: " + ((ClaseB)clases).getAtributoA1());
                System.out.println("atributoA2 de ClaseB: " + ((ClaseB)clases).getAtributoA2());
                System.out.println("atributoA3 de ClaseB: " + ((ClaseB)clases).getAtributoA3());
                System.out.println("atributoB1 de ClaseB: " + ((ClaseB)clases).getAtributoB1());
                ((ClaseB)clases).metodoA1(1);
                ((ClaseB)clases).metodoA2(2.2);
                ((ClaseB)clases).metodoA1(2);
                varI = ((ClaseB)clases).metodoB1("Hola");
            } else if (clases instanceof ClaseC) {
                System.out.println("atributoA1 de ClaseC: " + ((ClaseC)clases).getAtributoA1());
                System.out.println("atributoA2 de ClaseC: " + ((ClaseC)clases).getAtributoA2());
                System.out.println("atributoA3 de ClaseC: " + ((ClaseC)clases).getAtributoA3());
                System.out.println("atributoB1 de ClaseC: " + ((ClaseC)clases).getAtributoB1());
                System.out.println("atributoC1 de ClaseC: " + ((ClaseC)clases).getAtributoC1());
                ((ClaseC)clases).metodoA1(1);
                ((ClaseC)clases).metodoA2(2.2);
                ((ClaseC)clases).metodoA1(2);
                ((ClaseC)clases).metodoA1(3);
            }
        }
    }

}