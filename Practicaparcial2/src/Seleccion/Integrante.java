package Seleccion;

public class Integrante {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public String Viajar() {
		return "Estoy Viajando";
	}
	public String Concentrar() {
		return "Estoy Consentrando";
	}
	
	@Override
	public String toString() {
		return "Integrante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	public Integrante(String nombre, String apellido, int edad) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	public Integrante() {
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
