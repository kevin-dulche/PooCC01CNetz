public class Fabrica_4_0 {
	public static void main(String []args) {
		Empleado []emps = new Empleado[3];
		emps[0] = new Empleado("Karla", 300, new Fecha(1, 1, 2001));
		emps[1] = new Licenciado("Juan", 250, new Fecha(2, 2, 2002), "ventas");
		emps[2] = new Gerente("Danny", 700, new Fecha(3, 3, 2003), "DEV", 3000);
		Fabrica_4_0 fa = new Fabrica_4_0();
		fa.imprimeObjetos(emps);
	}
	
	public void imprimeObjetos(Empleado []emps) {
		for(Empleado e: emps) {
			if(e instanceof Gerente) {
				Gerente ger = (Gerente) e;
				System.out.println("******** Consulta del Ger ********");
				System.out.println("Nombre : " + ger.getNombre());
				System.out.println("Salario: " + ger.getSalario());
				System.out.println("F dia  : " + ger.getFecNac().getDia());
				System.out.println("F mes  : " + ger.getFecNac().getMes());
				System.out.println("F anio  : " + ger.getFecNac().getAnio());
				System.out.println("Depto  : " + ger.getDepto());	
				System.out.println("Bono   : " + ger.getBono());
			}
			else if(e instanceof Licenciado) {
				Licenciado lic = (Licenciado) e;
				System.out.println("******** Consulta del Lic ********");
				System.out.println("Nombre : " + lic.getNombre());
				System.out.println("Salario: " + lic.getSalario());
				System.out.println("F dia  : " + lic.getFecNac().getDia());
				System.out.println("F mes  : " + lic.getFecNac().getMes());
				System.out.println("F anio  : " + lic.getFecNac().getAnio());
				System.out.println("Depto  : " + lic.getDepto());			
			}
			else {
				System.out.println("******** Consulta del Emp ********");
				System.out.println("Nombre : " + e.getNombre());
				System.out.println("Salario: " + e.getSalario());
				System.out.println("F dia  : " + e.getFecNac().getDia());
				System.out.println("F mes  : " + e.getFecNac().getMes());
				System.out.println("F anio  : " + e.getFecNac().getAnio());				
			}
		}
	}
}