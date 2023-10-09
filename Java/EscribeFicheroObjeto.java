import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribeFicheroObjeto {
    public static void main(String[] args)
    {
    	FileOutputStream ficheroSalida;
    	ObjectOutputStream objetoSalida;
    	String nombreFichero = "C:\\Users\\jromero\\OneDrive\\Documents\\archivoPersona.dat";
    	
    	try {
    		ficheroSalida = new FileOutputStream(nombreFichero);
    		objetoSalida = new ObjectOutputStream(ficheroSalida);
    		// se escriben dos objetos de la clase Persona
    		objetoSalida.writeObject(new Alumno(55287188, "Karen", "Compu"));
    		objetoSalida.writeObject(new Alumno(40302010, "Carlos", "Mate"));
    		objetoSalida.close();
    	
    	} catch (FileNotFoundException e) {
    	System.out.println("¡El fichero no existe!");
    	} catch (IOException e) {
    	System.out.println(e.getMessage());
    	};
    	
    }
}