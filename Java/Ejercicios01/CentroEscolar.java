public class CentroEscolar {
	public static void main(String []args) {
		//Persona per = new Persona(); No se pueden crear objetos de clases abstractas
		Estudiante e1 = new Estudiante();
		e1.setNombre("Marcos");
		e1.setFecNac(new Fecha(1, 1, 2001));
		e1.setSexo(false);
		e1.setMatricula(1234);
		
		System.out.println("Nombre:   " + e1.getNombre());
		System.out.println("" + e1.getFecNac());
		boolean sx = e1.getSexo();
		if(sx) {
		   System.out.println("El sexo de la persona es mujer");
		} else {
			System.out.println("El sexo de la persona es hombre");
		}
		System.out.println("La matricula es: " + e1.getMatricula());
		
		System.out.println("Seg Soc: " + e1.propSeguroSoc());
		System.out.println("CURP :   " + e1.propCURP());
		if(e1.esDiabetico()) {
		   System.out.println("Es diabetico");
		} else {
			System.out.println("No es diabetico");
		}
		if(e1.esHipertenso()) {
			System.out.println("Es hipertenso");
		} else {
			System.out.println("No es hipertenso");
		}
		e1.imprimerHorario();
	}
}