public class MateDos {
	public static void main(String []args) {
		OperacionesVectores3D ov = new OperacionesVectores3D();
		Vector3D a = new Vector3D(2, 4, 5);
		Vector3D b = new Vector3D(-1, 1, 2);
		//Calcula el producto punto de dos vectores
		double res = ov.calculaProductoPunto(a, b);
		System.out.println("Resultado producto punto de a y b: " + res);
		//Calcula el producto cruz de dos vectores
		Vector3D c = ov.calculaProductoCruz(a, b);
		System.out.println("Componente X: " + c.getRefX());
		System.out.println("Componente Y: " + c.getRefY());
		System.out.println("Componente Z: " + c.getRefZ());	
	}
}