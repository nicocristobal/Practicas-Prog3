package Seleccion;

public class Entrenador extends Integrante implements Juego,Entrenamiento{
	
	private String sistemaJuego;
	private String estilo;
	
	
	
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
		return "Entrenador [sistemaJuego=" + sistemaJuego + ", estilo=" + estilo + "]"+super.toString();
	}

	public Entrenador(String nombre, String apellido, int edad, String sistemaJuego, String estilo) {
		super(nombre, apellido, edad);
		setSistemaJuego(sistemaJuego);
		setEstilo(estilo);
	}
		
	public Entrenador() {
		sistemaJuego = "";
		estilo = "";
	}

	public String getSistemaJuego() {
		return sistemaJuego;
	}
	public void setSistemaJuego(String sistemaJuego) {
		this.sistemaJuego = sistemaJuego;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}
