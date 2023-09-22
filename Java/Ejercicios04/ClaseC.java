public class ClaseC extends ClaseB{
    private int atributoC1;

    public ClaseC(String atributoA1, int atributoA2, double atributoA3, String atributoB1, int atributoC1){
        super(atributoA1, atributoA2, atributoA3, atributoB1);
        this.atributoC1 = atributoC1;
    }

    public ClaseC(){}

    public void setAtributoC1(int atributoC1) {
        this.atributoC1 = atributoC1;
    }

    public int getAtributoC1() {
        return atributoC1;
    }

    public void metodoA1(int A){
        System.out.println("metodoA1 de ClaseC");
    }
}