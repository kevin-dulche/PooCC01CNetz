public abstract class ClaseAbstracta {
    private String atributoCA1;
    private double atributoCA2;

    public ClaseAbstracta(String atributoCA1, double atributoCA2){
        this.atributoCA1 = atributoCA1;
        this.atributoCA2 = atributoCA2;
    }

    public ClaseAbstracta(){}

    public void setAtributoCA1(String atributoCA1) {
        this.atributoCA1 = atributoCA1;
    }

    public String getAtributoCA1() {
        return atributoCA1;
    }

    public void setAtributoCA2(double atributoCA2) {
        this.atributoCA2 = atributoCA2;
    }

    public double getAtributoCA2() {
        return atributoCA2;
    }

    public double metodoCA1(String x, int y){
        return 0.0;
    }

    public abstract int metodoCA2(double z);

    public abstract String metodoCA3();
}