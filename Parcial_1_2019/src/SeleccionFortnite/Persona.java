package SeleccionFortnite;

public class Persona {
	private String nombre;
	private String apellido;
	private String edad;
	private String localidad;
	
	
	public String estoyViajando(){
		return "Estoy Viajando";
	}
	public String estoyConcentracion() {
		return "Estoy Concentrando";
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad=" + getEdad() + ", localidad=" + getLocalidad()
				+ "]";
	}
	// Constructor Vacio
	public Persona() {
		super();
		nombre = "";
		apellido = "";
		edad = "";
		localidad = "";
	}
	// Constructor 
	public Persona(String nombre, String apellido, String edad, String localidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.localidad = localidad;
	}
	// Constructor de copia
	public Persona(Persona persona) {
		super();
		setNombre(persona.getNombre());
		setApellido(persona.getApellido());
		setEdad(persona.getEdad());
		setLocalidad(persona.getLocalidad());
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
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	

}
