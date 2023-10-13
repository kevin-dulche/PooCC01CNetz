import java.util.ArrayList;
import java.util.List;

public class Listas_01 {
	public static void main (String[] args){
		List lista = new ArrayList();
		lista.add(new Integer(5));
		lista.add("Cinco");
		lista.add(new Alumno(123, "Juan", "Compu"));
		System.out.println(lista);
		
	}
}