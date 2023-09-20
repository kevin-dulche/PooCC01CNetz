public class Estudiante extends Persona {
    private long matricula;

    public Estudiante(String nombre, Fecha fecNac, long matricula){
        super(nombre, fecNac);
        this.matricula = matricula;
    }

    public void imprimeDescripcion(){
        System.out.println("Soy una clase Estudiante");
        System.out.println("Con matricula: " + matricula);
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public long getMatricula() {
        return matricula;
    }

    public void imprimeCiclo(){

    }
}
