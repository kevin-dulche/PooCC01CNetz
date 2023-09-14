public class PasaArregloPrimitivo {
	public static void main(String []args) {
		PasaArregloPrimitivo pa = new PasaArregloPrimitivo();
		//Solicitar datos
		double []valores = {4, 5, 1, 3, 2};
		//Logica de mi negocio
		double med = pa.media(valores);
		//Obtener resultados
		System.out.println("La media de los valores es: " + med);
	}
	
	//Este metodo calcula la media de un conjunto de valores
	//contenidos en un arreglo
	public double media(double []vec) {
		double acum = 0;
		for(int i = 0; i < vec.length; i++) {
			acum += vec[i];
		}
		return (acum / vec.length);
	}
}