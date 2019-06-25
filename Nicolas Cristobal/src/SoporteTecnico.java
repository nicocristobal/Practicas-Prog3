import java.util.ArrayList;

public class SoporteTecnico extends Persona{
	private String areaEspecializadas;
	
	@Override
	public String toString() {
		return "SoporteTecnico [areaEpecializadas=" + areaEspecializadas + "]"+super.imprimirPersona();
	}	
	public SoporteTecnico(String nombre, String apellido, int edad, String localidad,
			ArrayList<String> registrodePeronas, String areaEpecializadas) {
		super(nombre, apellido, edad, localidad, registrodePeronas);
		this.areaEspecializadas = areaEpecializadas;
	}
	public String getAreaEpecializadas() {
		return areaEspecializadas;
	}
	public void setAreaEpecializadas(String areaEpecializadas) {
		this.areaEspecializadas = areaEpecializadas;
	}

	
}
