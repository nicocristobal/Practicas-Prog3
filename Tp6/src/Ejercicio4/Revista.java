package Ejercicio4;

public class Revista extends Publicacion{

	private int numero;

	
	
	@Override
	public String toString() {
		return "Revista [numero=" + numero + "]"+super.toString();
	}
	public Revista(String codigo, String titulo, int anio, int numero) {
		super(codigo, titulo, anio);
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
