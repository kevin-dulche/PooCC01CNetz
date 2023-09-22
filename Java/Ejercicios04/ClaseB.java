public class ClaseB extends ClaseA{
    private String atributoB1;

    public ClaseB(String atributoA1, int atributoA2, double atributoA3, String atributoB1){
        super(atributoA1, atributoA2, atributoA3);
        this.atributoB1 = atributoB1;
    }

    public ClaseB(){}

    public void setAtributoB1(String atributoB1) {
        this.atributoB1 = atributoB1;
    }

    public String getAtributoB1() {
        return atributoB1;
    }

    public int metodoB1(String B){
        System.out.println("metodoB1 de ClaseB");
        return 0;
    }

    public void metodoA1(int A){
        System.out.println("metodoA1 de ClaseB");
    }
}