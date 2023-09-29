public class Registro {
    private int id;
    private Fecha[] fecha;

    public Registro(int id, Fecha[] fecha){
        this.id = id;
        this.fecha = fecha;
    }

    public Registro(){}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFecha(Fecha[] fecha) {
        this.fecha = fecha;
    }

    public Fecha[] getFecha() {
        return fecha;
    }
}
