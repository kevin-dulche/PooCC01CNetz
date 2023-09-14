public class Ciudadano {
    private String nombre;
    private Domicilio direccion;

    public Ciudadano(String nombre ,Domicilio direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Ciudadano() {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDomicilio(Domicilio direccion) {
        this.direccion = direccion;
    }

    public Domicilio getDomicilio() {
        return direccion;
    }
}