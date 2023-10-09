import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeeFicheroObjeto {
    public static void main(String[] args)
    {
    	FileInputStream ficheroEntrada;
    	ObjectInputStream objetoEntrada;
    	String nombreFichero = "C:\\Users\\jromero\\OneDrive\\Documents\\archivoPersona.dat";
    	try {
    		ficheroEntrada = new FileInputStream(nombreFichero);
    		objetoEntrada = new ObjectInputStream(ficheroEntrada);
    		// se leen dos objetos de la clase Persona
    		Alumno p1 = (Alumno)objetoEntrada.readObject();
    		Alumno p2 = (Alumno)objetoEntrada.readObject();
    		objetoEntrada.close();
    		System.out.println("Alumnos");
    		System.out.println("Matricula: " + p1.getMatricula());
    		System.out.println("Nombre   : " + p1.getNombre());
    		System.out.println("Carrera  : " + p1.getCarrera());
    		System.out.println("-----------------------------------------");
    		System.out.println("Matricula: " + p2.getMatricula());
    		System.out.println("Nombre   : " + p2.getNombre());
    		System.out.println("Carrera  : " + p2.getCarrera());
    		System.out.println("-----------------------------------------");
    		} catch (FileNotFoundException e) {
    			System.out.println("¡El fichero no existe!");
    		} catch (IOException e) {
    			System.out.println(e.getMessage());
    		} catch (ClassNotFoundException e) {
    			System.out.println(e.getMessage());
    		};
    }
}