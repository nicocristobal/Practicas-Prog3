package Libro;

public class Libro{

	private String titulo;
	private int precio;
	private int stock ;
	private Autor autor;

	public Libro(String titulo, int precio, int stock, Autor autor) {
		this.titulo = titulo;
		this.precio = precio;
		this.stock = stock;
		this.autor = autor;
	}

	public String imprimirAutor() {
		return autor.getNombre()+autor.getApellido()+autor.getEmail()+autor.getGenero();
	}
	
	public String imprimir() {
		return "Libro [Titulo=" + titulo + ", Precio=" + precio + ", Stock=" + stock + ", Autor=" + autor.nombreApellido() +"]";
	}

	public String imprimirMensaje() {
		return "El titulo " + titulo + " de " + autor.nombreApellido() + " se vende a " + precio + " pesos";
		//" El libro, {t�tulo} de {nombre del autor}. Se vende a {precio} pesos. "
	}
	
	public int nuevoPrecio() {
		return precio+50;
	}
	public int nuevaCantidad() {
		return stock+50;
	}
	
	
}
