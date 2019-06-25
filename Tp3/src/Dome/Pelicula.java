package Dome;

public class Pelicula extends Elemento{
	
	private String director;
	
	public Pelicula(String titulo, double duracion, String autor, boolean favorito, String comentario, String director) {
		super(titulo, duracion, autor, favorito, comentario);
		this.director=director;
	}

	public String imprimirPelicula() {
		return "Pelicula - Director"+director+ "-"+super.imprimirElemento();
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

		

	
	
}
