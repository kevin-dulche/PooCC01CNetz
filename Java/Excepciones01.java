public class Excepciones01 {
	public static void main (String[] args){
		//Primer ejemplo de excepciones
		int []vector = new int[3];
		vector[0] = 0;
		try {
			vector[3] = 3;
			System.out.println("Ultimo elemento: " + vector[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("El error es: " + e.getMessage());
		}
		int valor = 0;
		try {
			valor = 5/0;
		}catch (ArithmeticException e) {
			System.out.println("El error es: " + e.getMessage());
		}
		System.out.println("El valor es: " + valor);
	}
}