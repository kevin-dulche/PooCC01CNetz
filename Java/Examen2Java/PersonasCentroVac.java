package Examen2Java;

public class PersonasCentroVac {
    private String nombre;
    private Fecha fechaIngresoC;

    public PersonasCentroVac(String nombre, Fecha fechaIngresoC){
        this.nombre = nombre;
        this.fechaIngresoC = fechaIngresoC;
    }

    public PersonasCentroVac(){}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaIngresoC(Fecha fechaIngresoC) {
        this.fechaIngresoC = fechaIngresoC;
    }

    public Fecha getFechaIngresoC() {
        return fechaIngresoC;
    }
}