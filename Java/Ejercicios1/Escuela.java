public class Escuela {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        alu.setNombre("Juan");
        alu.setMatricula(12345);
        System.out.println("Nombre: " + alu.getNombre());
        System.out.println("Matricula: " + alu.getMatricula());
    }
}