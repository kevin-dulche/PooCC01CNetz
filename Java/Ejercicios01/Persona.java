public abstract class Persona {
	private String nombre;
	private Fecha fecNac;
	private boolean sexo;
	
	public Persona(String nombre, Fecha fecNac, boolean sexo) {
		this.nombre = nombre;
		this.fecNac = fecNac;
		this.sexo = sexo;
	}
	public Persona() {}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Fecha getFecNac() {
		return fecNac;
	}
	public void setFecNac(Fecha fecNac) {
		this.fecNac = fecNac;
	}
	public boolean getSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	public abstract boolean esDiabetico();
	
	public abstract boolean esHipertenso();
	
}