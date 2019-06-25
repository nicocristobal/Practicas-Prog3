package SeleccionFortnite;

public class SoporteTecnico extends Persona{
	private String areaEspecializada;

	public String arreglar() {
		return "Estoy arreglando";
	}
	@Override
	public String toString() {
		return "SoporteTecnico [areaEspecializada=" + areaEspecializada + "]"+super.toString();
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
	public SoporteTecnico() {
		super();
		setAreaEspecializada("");
	}
	//
	public SoporteTecnico(String nombre, String apellido, String edad, String localidad, String areaEspecializada) {
		super(nombre, apellido, edad, localidad);
		this.areaEspecializada = areaEspecializada;
	}
	//Copia
	public SoporteTecnico(SoporteTecnico soporteTec) {
		super(soporteTec.getNombre(),soporteTec.getApellido(),soporteTec.getEdad(),soporteTec.getLocalidad());
		this.areaEspecializada = soporteTec.getAreaEspecializada();
	}

	public String getAreaEspecializada() {
		return areaEspecializada;
	}
	
	public void setAreaEspecializada(String areaEspecializada) {
		this.areaEspecializada = areaEspecializada;
	}
	
	

}
