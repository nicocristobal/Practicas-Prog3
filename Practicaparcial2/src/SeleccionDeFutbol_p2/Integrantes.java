package SeleccionDeFutbol_p2;

public class Integrantes {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public String estoyViajando(){
		return "Estoy viajando";
	}
	
	public String estoyConcentrar(){
		return "Estoy viajando";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Integrantes other = (Integrantes) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Integrantes [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	 //Constructor
	
	public Integrantes(String nombre, String apellido, int edad) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	
	 // Constructor vacio
	 
	public Integrantes() {
		super();
		nombre = "";
		apellido = "";
		edad = 0;
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

	
	
	
}