package VideoClub;

import java.util.ArrayList;
import java.util.Date;

public abstract class Producto {
	
	private String titulo;
	boolean entregado;
	private String genero;
	private int id;
	private int stock;
	private ArrayList<String>RegistroDeAlquiles;
		
	// agregar los metodos alquilar y devolver
	
	public void agregarRegistroPelucula(Date fecha, Cliente c ) {
		String e="El Cliente id="+c.getIdCliente()+c.getNombre()+c.getApellido()+"alquilo pelicual el dia"+fecha;
		RegistroDeAlquiles.add(e);
	}
	
	public void agregarRegistroJuego(Date fecha, Cliente c) {
		String e= "El cliente id="+c.getIdCliente()+c.getNombre()+c.getApellido()+"alquilo el juego el dia"+fecha;
		RegistroDeAlquiles.add(e);
	}
	
	public void listarRegistro() {
		for(String registro: RegistroDeAlquiles)
			System.out.println(registro);
	}
	
	public String imprimirProducto() {
		return "Producto [titulo=" + getTitulo() + ", entregado=" + isEntregado() +
				", genero=" + getGenero() + ", id=" + getId()+ ", stock=" + getStock() + "]";
	}

	public void entregar() {
		this.entregado=true;
		setStock(stock-1);
	}
	
	public void devolver() {
		this.entregado=false;
		setStock(stock+1);
	}
	
	public boolean isEntregado() {
		return entregado;
	}
	
	abstract public int comparar (Producto a);
	
	
	
	
	public Producto(String titulo, boolean entregado, String genero, int id, int stock,
			ArrayList<String> registroDeAlquiles) {
		super();
		this.titulo = titulo;
		this.entregado = false;
		this.genero = genero;
		this.id = id;
		this.stock = stock;
		RegistroDeAlquiles = registroDeAlquiles;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}