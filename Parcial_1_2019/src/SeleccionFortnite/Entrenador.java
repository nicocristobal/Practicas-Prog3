package SeleccionFortnite;

public class Entrenador extends Persona{
	private int aniosExp;

	public String darIndicaciones() {
		return "dando indicaciones a los jugadores";
	}
	
	@Override
	public String toString() {
		return "Entrenador [aniosExp=" + aniosExp + "]"+super.toString();
	}
	@Override
	public String estoyConcentracion() {
		return super.estoyConcentracion();
	}
	@Override
	public String estoyViajando() {
		return super.estoyViajando();
	}

	//Vacio
	public Entrenador() {
		super();
		aniosExp = 0;
	}
	
	public Entrenador(String nombre, String apellido, String edad, String localidad, int aniosExp) {
		super(nombre, apellido, edad, localidad);
		this.aniosExp = aniosExp;
	}
	//Copia
	public Entrenador(Entrenador entrenador) {
		super(entrenador.getNombre(),entrenador.getApellido(),entrenador.getEdad(),entrenador.getLocalidad());
		this.aniosExp = entrenador.getAniosExp();
	}

	public int getAniosExp() {
		return aniosExp;
	}
	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	

}
