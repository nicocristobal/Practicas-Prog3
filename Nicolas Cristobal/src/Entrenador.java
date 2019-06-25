import java.util.ArrayList;

public class Entrenador extends Persona{
	private int aniosDeExperiencia;

	@Override
	public String toString() {
		return "Entrenador [aniosDeExperiencia=" + aniosDeExperiencia + "]"+super.imprimirPersona();
	}
	public Entrenador(String nombre, String apellido, int edad, String localidad, ArrayList<String> registrodePeronas,
			int aniosDeExperiencia) {
		super(nombre, apellido, edad, localidad, registrodePeronas);
		this.aniosDeExperiencia = aniosDeExperiencia;
	}
	public int getAniosDeExperiencia() {
		return aniosDeExperiencia;
	}
	public void setAniosDeExperiencia(int aniosDeExperiencia) {
		this.aniosDeExperiencia = aniosDeExperiencia;
	}

	
	
}
