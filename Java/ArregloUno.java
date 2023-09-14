public class ArregloUno {
	public static void main(String []args) {
		// Declarar un arreglo
		int []vec = new int[4];
		
		//Inicializo el arreglo
		vec[0] = 2;
		vec[1] = 6;
		vec[2] = 10;
		vec[3] = 22;
		
		//Se imprime a consola el arreglo
		for(int i = 0; i < vec.length; i++) {
			System.out.println("vec[" + i + "] = " + vec[i]);
		}
		
	}
}