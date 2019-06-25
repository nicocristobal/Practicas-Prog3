package Ejercicio4;

public class Libro extends Publicacion implements Prestable{

	private boolean prestado;

	
	@Override
	public String toString() {
		return "Libro [prestado=" + prestado + "]"+super.toString();
	}
	
	public Libro(String codigo, String titulo, int anio, boolean prestado) {
		super(codigo, titulo, anio);
		prestado = false;
	}

	@Override
	public void prestar() {
		prestado=true;	
	}

	@Override
	public void devolver() {
		prestado=false;
	}

	@Override
	public boolean prestado() {
		return prestado;
	}
	
	

	

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	
}
