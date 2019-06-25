package SeleccionDeFutbol_p2;

public class Futbolista extends Integrantes implements Juego  {

	private int numeroCamiseta;
	private int puesto;
	
	
	
	

	@Override
	public String estoyViajando() {
		// TODO Apéndice de método generado automáticamente
		return super.estoyViajando();
	}

	@Override
	public String estoyConcentrar() {
		// TODO Apéndice de método generado automáticamente
		return super.estoyConcentrar();
	}

	@Override
	public int jugar() {
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroCamiseta;
		result = prime * result + puesto;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		if (numeroCamiseta != other.numeroCamiseta)
			return false;
		if (puesto != other.puesto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Futbolista [numeroCamiseta=" + numeroCamiseta + ", puesto=" + puesto + "]"+super.toString();
	}

	public Futbolista(String nombre, String apellido, int edad, int numeroCamiseta, int puesto) {
		super(nombre, apellido, edad);
		this.numeroCamiseta = numeroCamiseta;
		this.puesto = puesto;
	}
		
	public Futbolista(int numeroCamiseta, int puesto) {
		super();
		numeroCamiseta = 0;
		puesto = 0;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public int getPuesto() {
		return puesto;
	}
	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}
	
	
	
}
