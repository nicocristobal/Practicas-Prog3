package Seleccion;

public class AyudanteCampo extends Integrante implements Juego,Entrenamiento{
	
	private String metodologia;

	
	
	@Override
	public String Entrenar() {
		return null;
	}
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
		return "AyudanteCampo [metodologia=" + metodologia + "]"+super.toString();
	}

	public AyudanteCampo(String nombre, String apellido, int edad, String metodologia) {
		super(nombre, apellido, edad);
		setMetodologia(metodologia);
	}
	
	public AyudanteCampo(String metodologia) {
		metodologia = "";
	}

	public String getMetodologia() {
		return metodologia;
	}
	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}
	
	

}
