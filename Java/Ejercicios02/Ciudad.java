public class Ciudad {
	public static void main(String []args) {
		//Arreglos de clases
		// int []vec = new int[3]; <- Arreglo de tipo entero
        
		//Se crea un arreglo de 3 objetos de tipo Ciudadano
		Ciudadano []ds = new Ciudadano[3];
		//Primer caso
		Ciudadano c1 = new Ciudadano("Juan Perez", new Domicilio("BJ", 1, 1010));
		ds[0] = c1;
		//Segundo caso
		ds[1] = new Ciudadano("Maria Perez", new Domicilio("Iz", 2, 1020));
		//Tercer caso
		Domicilio d1 = new Domicilio("CU", 3, 1030);
		Ciudadano c2 = new Ciudadano("Juan Perez", d1);
		//ds[2] = d1; Intentar pasar un objeto diferente
		ds[2] = c2;
		
		//Imprimir ese arreglo de tipo Ciudadano
		for(int i = 0; i < ds.length; i++) {
			System.out.println("******************************");
			System.out.println("Elemento del arreglo: " + (i + 1));
			System.out.println("Nombre   : " + ds[i].getNombre());
			System.out.println("Calle    : " + ds[i].getDireccion().getCalle());
			System.out.println("Numero   : " + ds[i].getDireccion().getNum());
			System.out.println("CP       : " + ds[i].getDireccion().getCp());
		}
	}
}