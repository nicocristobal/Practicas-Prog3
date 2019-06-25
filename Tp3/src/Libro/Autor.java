package Libro;

public class Autor{
	
	private String nombre, apellido, email, genero;

	
	public Autor(String nombre, String apellido, String email, String genero) {
		setNombre(nombre);
		setApellido(apellido);
		setEmail(email);
		setGenero(genero);
	}
	
	
	
	public String nombreApellido() {
		return nombre+apellido;
	}


	public String imprimir() {
		return "Autor [Nombre=" + nombre + ", Apellido=" + apellido + ", Email=" + email + ", Genero=" + genero +"]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
