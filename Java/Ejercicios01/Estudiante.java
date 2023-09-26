public class Estudiante extends Persona implements IdsPersonas{
	private int matricula;
		
	public Estudiante(String nombre, Fecha fecNac, boolean sexo, int matricula) {
		super(nombre, fecNac, sexo);
		this.matricula = matricula;
	}

	public Estudiante() {}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String propSeguroSoc() {
		//Consulta la BD con base en la matricula y obtiene en numero de Seguro Social
		return "ABC123XYZ";
	}

	@Override
	public String propCURP() {
		//Consulta la BD con base en la matricula y obtiene el CURP
		return "ABDF01012001MDFWX";
	}

	@Override
	public boolean esDiabetico() {
		return false;
	}

	@Override
	public boolean esHipertenso() {
		return true;
	}

	public void imprimerHorario() {
		System.out.println("Esta en la tarde");
	}
}