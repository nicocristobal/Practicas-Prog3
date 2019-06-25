package VideoClub;

import java.util.ArrayList;

public class Juegos extends Producto {
	
	private String compania;
	private int horasEstimadas;
	
	@Override
	public String toString() {
		return "Juegos [compania=" + compania + ", horasEstimadas=" + horasEstimadas + "]"+super.imprimirProducto();
	}	
	@Override
	public int comparar(Producto a) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Juegos(String titulo, boolean entregado, String genero, int id, int stock,
			ArrayList<String> registroDeAlquiles, String compania, int horasEstimadas) {
		super(titulo, entregado, genero, id, stock, registroDeAlquiles);
		this.compania = compania;
		this.horasEstimadas = horasEstimadas;
	}
	
		
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	

}
