public class Excepciones02 {
	public static void main (String[] args){
		Excepciones02 e2 = new Excepciones02();
		try {
			e2.manejandoProblemas();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("El error es: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("El error es: " + e.getMessage());
		}
	}
	
	
	public void manejandoProblemas() throws ArrayIndexOutOfBoundsException, ArithmeticException {
        int valor = 0;
        valor = 6/0;
        System.out.println("El valor es: " + valor);
		int []vector = new int[3];
		vector[0] = 0;
		vector[3] = 3;
        System.out.println("Ultimo elemento: " + vector[3]);

	}
}