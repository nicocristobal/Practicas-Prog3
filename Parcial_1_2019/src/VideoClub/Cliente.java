package VideoClub;

public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellido;
	
	
	public String imprimirCliente() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public String imprimirNombreApellido() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public Cliente(int idCliente, String nombre, String apellido) {
		setIdCliente(idCliente);
		setNombre(nombre);
		setApellido(apellido);
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
	
}
