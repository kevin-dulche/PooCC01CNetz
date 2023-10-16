public class EstudianteGraduado extends Estudiante{
    private String titulo;
    private int anioGrad;

    public EstudianteGraduado(String nombre, int edad, int noId, String titulo, int anioGrad){
        super(nombre, edad, noId);
        this.titulo = titulo;
        this.anioGrad = anioGrad;
    }

    public EstudianteGraduado(){}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnioGrad(int anioGrad) {
        this.anioGrad = anioGrad;
    }

    public int getAnioGrad() {
        return anioGrad;
    }

    public void mostrarInformacion(boolean grad){
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre                  : " + super.getNombre());
        System.out.println("Edad                    : " + super.getEdad());
        System.out.println("Numero de Identificacion: " + super.getNoId());
        System.out.println("Titulo                  : " + getTitulo());
        System.out.println("Anio de graduacion      : " + getAnioGrad());
    }
}