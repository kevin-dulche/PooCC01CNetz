public class ArregloDos {
	public static void main(String []args) {
		// Declarar un arreglo
		int []vec = new int[4];		
		//Inicializo el arreglo
		vec[0] = 3;
		vec[1] = 7;
		vec[2] = 11;
		vec[3] = 33;
		imprimeArreglo(vec);
	}
	
	static void imprimeArreglo(int []arreglo) {
		for(int i = 0; i < arreglo.length; i++) {
			System.out.println("vec[" + i + "] = " + arreglo[i]);
		}
	}
}