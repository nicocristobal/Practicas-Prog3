package SeleccionDeFutbol_p2;

public class AyudanteDeCampo extends Integrantes implements Juego,Entrenamiento {
	
	private String metodologia;

	
	
	
	@Override
	public String estoyViajando() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return super.estoyViajando();
	}

	@Override
	public String estoyConcentrar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return super.estoyConcentrar();
	}

	@Override
	public void entrenar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public int jugar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return 0;
	}

	@Override
	public String toString() {
		return "AyudanteDeCampo [metodologia=" + metodologia + "]"+super.toString();
	}

	public AyudanteDeCampo(String nombre, String apellido, int edad, String metodologia) {
		super(nombre, apellido, edad);
		setMetodologia(metodologia);
	}
	
	public AyudanteDeCampo() {
		super();
		metodologia = "";
	}

	public String getMetodologia() {
		return metodologia;
	}
	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}
	
	

}