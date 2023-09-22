public class ClaseD extends ClaseAbstracta{
    private double atributoD1;

    public ClaseD(String atributoCA1, double atributoCA2, double atributoD1){
        super(atributoCA1, atributoCA2);
        this.atributoD1 = atributoD1;
    }

    public ClaseD(){}

    public void setAtributoD1(double atributoD1) {
        this.atributoD1 = atributoD1;
    }

    public double getAtributoD1() {
        return atributoD1;
    }

    public int metodoD1(int d1, int d2){
        System.out.println("metodoD1 de ClaseD");
        return 0;
    }

    public double metodoD2(double d3){
        System.out.println("metodoD2 de ClaseD");
        return 0.0;
    }

    public int metodoCA2(double d4){
        System.out.println("metodoCA2 de ClaseD");
        return 0;
    }

    public String metodoCA3(){
        System.out.println("metodoCA3 de ClaseD");
        return "@Hola";
    }
}