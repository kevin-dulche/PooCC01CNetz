public class Estudiante extends Persona implements Aprobable{
    private int noId;

    public Estudiante(String nombre, int edad, int noId){
        super(nombre, edad);
        this.noId = noId;
    }

    public Estudiante(){}

    public void setNoId(int noId) {
        this.noId = noId;
    }

    public int getNoId() {
        return noId;
    }

    public void mostrarInformacion(){
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre                  : " + super.getNombre());
        System.out.println("Edad                    : " + super.getEdad());
        System.out.println("Numero de Identificacion: " + noId);
    }

    public void actualizarEdad(int edad){
        super.setEdad(edad);
    }

    @Override
    public void puedeAprobar() {
    }
}