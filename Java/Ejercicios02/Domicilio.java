public class Domicilio {
	private String calle;
	private int num;
	private int cp;
	
	public Domicilio(String calle, int num, int cp) {
		this.calle = calle;
		this.num = num;
		this.cp = cp;
	}
	public Domicilio() {}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCalle() {
		return calle;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getCp() {
		return cp;
	}
	
	public void imprimeDireccion() {
		System.out.println("Calle: " + calle);
		System.out.println("Num  : " + num);
		System.out.println("CP   : " + cp);
	}
}