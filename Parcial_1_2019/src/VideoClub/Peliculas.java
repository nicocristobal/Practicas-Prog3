package VideoClub;

import java.util.ArrayList;

public class Peliculas extends Producto{

	private int duracion;
	private String creador;
		
	@Override
	public String toString() {
		return "Peliculas [duracion=" + getDuracion() + ", creador=" + getCreador() + "]"+super.imprimirProducto();
	}
		
	@Override
	public int comparar(Producto a) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Peliculas(String titulo, boolean entregado, String genero, int id, int stock,
			ArrayList<String> registroDeAlquiles, int duracion, String creador) {
		super(titulo, entregado, genero, id, stock, registroDeAlquiles);
		this.duracion = duracion;
		this.creador = creador;
	}

	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
		
}
