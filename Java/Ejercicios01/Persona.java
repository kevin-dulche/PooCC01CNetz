public abstract class Persona {
    private String nombre;
    private Fecha fecNac;

    public Persona(String nombre, Fecha fecNac){
        this.nombre = nombre;
        this.fecNac = fecNac;
    }

    public Persona(){}

    public abstract void imprimeDescripcion();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecNac(Fecha fecNac) {
        this.fecNac = fecNac;
    }

    public Fecha getFecNac() {
        return fecNac;
    }
}