import java.util.ArrayList;
import java.util.List;

public class Listas_02 {
    public static void main(String[] args) {
        // lIsta numerica

        List <Alumno>alus = new ArrayList<Alumno>();
        alus.add(new Alumno(1234, "Juan", "Compu"));
        alus.add(new Alumno(1235, "Mario", "Mate"));
        alus.add(new Alumno(1235, "Karen", "Mate"));

        for (Alumno alumno : alus) {
            System.out.println("Alumnos");
            System.out.println("Matricula: " + alumno.getMatricula());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Carrera: " + alumno.getCarrera());
            System.out.println("-----------------------------------------------------");
        }

        for (int i = 0; i < alus.size(); i++) {
            System.out.println("Alumnos");
            System.out.println("Matricula: " + alus.get(i).getMatricula());
            System.out.println("Nombre: " + alus.get(i).getNombre());
            System.out.println("Carrera: " + alus.get(i).getCarrera());
            System.out.println("-----------------------------------------------------");
        }
    }    
}