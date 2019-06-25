package CuentaBancaria;

public class Cliente {
	private int id;
	private String nombre;
	private String genero;
	
	public Cliente(int id, String nombre, String genero) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public String imprimirCliente() {
		return "id= " + id + ", Nombre= " + nombre + ", Genero=" + genero ;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
