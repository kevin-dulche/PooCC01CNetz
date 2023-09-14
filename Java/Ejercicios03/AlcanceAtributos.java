public class AlcanceAtributos {
    // Atributos
    public String atributoPublico;
    private String atributoPrivado;

    // Constructor
    public AlcanceAtributos(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }

    // Constructor vacio
    public AlcanceAtributos() {}

    //Inicializa el atributo privado
    public void inicializaAP(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }

    public String obtenerAP() {
        return atributoPrivado;
    }
}