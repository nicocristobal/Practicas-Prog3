package SeleccionDeFutbol_p2;

public class Entrenador extends Integrantes implements Juego, Entrenamiento{
	
	private String sistDeJuego;
	private String estilo;
		
	
	

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
		
	}

	@Override
	public int jugar() {
		return 0;
	}

	@Override
	public String toString() {
		return "Entrenador [sistDeJuego=" + sistDeJuego + ", estilo=" + estilo + "]"+super.toString();
	}

	public Entrenador(String nombre, String apellido, int edad, String sistDeJuego, String estilo) {
		super(nombre, apellido, edad);
		setSistDeJuego(sistDeJuego);
		setEstilo(estilo);
	}
	
	public Entrenador() {
		super();
		sistDeJuego = "";
		estilo = "";
	}

	public String getSistDeJuego() {
		return sistDeJuego;
	}
	public void setSistDeJuego(String sistDeJuego) {
		this.sistDeJuego = sistDeJuego;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}