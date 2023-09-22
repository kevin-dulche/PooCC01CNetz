public class ClaseA {
    private String atributoA1;
    private int atributoA2;
    private double atributoA3;
    
    public ClaseA(String atributoA1, int atributoA2, double atributoA3){
        this.atributoA1 = atributoA1;
        this.atributoA2 = atributoA2;
        this.atributoA3 = atributoA3;
    }

    public ClaseA(){}

    public void setAtributoA1(String atributoA1) {
        this.atributoA1 = atributoA1;
    }

    public String getAtributoA1() {
        return atributoA1;
    }

    public void setAtributoA2(int atributoA2) {
        this.atributoA2 = atributoA2;
    }

    public int getAtributoA2() {
        return atributoA2;
    }

    public void setAtributoA3(double atributoA3) {
        this.atributoA3 = atributoA3;
    }

    public double getAtributoA3() {
        return atributoA3;
    }

    public void metodoA1(int A){
        System.out.println("metodoA1 de ClaseA");
    }

    public void metodoA2(double A){
        System.out.println("metodoA2 de ClaseA");
    }
}