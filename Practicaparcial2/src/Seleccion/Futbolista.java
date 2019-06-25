package Seleccion;

public class Futbolista extends Integrante implements Juego {
	
	private int numeroDeCamiseta;
	private String puesto;
	
	
	
	
	@Override
	public String Jugar() {
		return null;
	}
	@Override
	public String Viajar() {
		return super.Viajar();
	}

	@Override
	public String Concentrar() {
		return super.Concentrar();
	}

	@Override
	public String toString() {
		return "Futbolista [numeroDeCamiseta=" + numeroDeCamiseta + ", puesto=" + puesto + "]"+super.toString();
	}

	public Futbolista(String nombre, String apellido, int edad, int numeroDeCamiseta, String puesto) {
		super(nombre, apellido, edad);
		setNumeroDeCamiseta(numeroDeCamiseta);
		setPuesto(puesto);
	}
		
	public Futbolista() {
		super();
		numeroDeCamiseta = 0;
		puesto = "";
	}

	public int getNumeroDeCamiseta() {
		return numeroDeCamiseta;
	}
	public void setNumeroDeCamiseta(int numeroDeCamiseta) {
		this.numeroDeCamiseta = numeroDeCamiseta;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	
	

}
