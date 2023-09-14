public class PasaArregloClase {
	public static void main(String []args) {
		PasaArregloClase pac = new PasaArregloClase();
		Domicilio []dms = new Domicilio[3];
		dms[0] = new Domicilio("Calle uno", 1, 1011);
		dms[1] = new Domicilio("Calle dos", 2, 1012);
		dms[2] = new Domicilio("Calle tre", 3, 1013);
		pac.imprimeDomicilio(dms);
	}
	
	public void imprimeDomicilio(Domicilio []dom) {
		for(int i = 0; i < dom.length; i++) {
			System.out.println("******************************");
			System.out.println("Elemento del arreglo: " + (i + 1));
			System.out.println("Calle    : " + dom[i].getCalle());
			System.out.println("Numero   : " + dom[i].getNum());
			System.out.println("CP       : " + dom[i].getCp());
		}
	}
}