import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String localidad;
	private ArrayList<String>RegistrodePeronas;
	
	public void agregarRegDePersonas(Persona p) {
		String e="La Persona= "+p.imprimirPersona()+"Integra la lista del plantel";
		RegistrodePeronas.add(e);
	}
			
	public String imprimirPersona() {
		return "Persona [nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad=" + getEdad() + ", localidad=" + getLocalidad()
				+ "]";
	}
		
	public Persona(String nombre, String apellido, int edad, String localidad, ArrayList<String> registrodePeronas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.localidad = localidad;
		RegistrodePeronas = registrodePeronas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
}
