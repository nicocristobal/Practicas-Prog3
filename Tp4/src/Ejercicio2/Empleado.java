package Ejercicio2;

public abstract class Empleado {
	private String dni;
	private String Nombre;
	private String Apellido;
	private int anioIngreso;
	
	
	abstract public double obtenerSalario();
	
	
	public String imprimirEmpleado() {
		return "Empleado [dni=" + dni + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", anioIngreso=" + anioIngreso
				+ "]";
	}
	public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
		super();
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
		setAnioIngreso(anioIngreso);
	}
	public Empleado() {
		super();
		dni="";
		Nombre="";
		Apellido = "";
		anioIngreso=0;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getAnioIngreso() {
		return anioIngreso;
	}
	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}
	
	
}
