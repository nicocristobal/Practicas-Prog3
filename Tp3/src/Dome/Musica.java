package Dome;

public class Musica extends Elemento{
	
	private int cantidadDeTemas;
		
		public Musica(String titulo, double duracion, String autor, boolean favorito, String comentario,
			int cantidadDeTemas) {
		super(titulo, duracion, autor, favorito, comentario);

		this.cantidadDeTemas=cantidadDeTemas;
	}
		
		public String imprimirMusica() {
			return "Musica - Cantidad de Temas"+cantidadDeTemas+ "-"+super.imprimirElemento();
		}
		
		public int getCantidadDeTemas() {
			return cantidadDeTemas;
		}

		public void setCantidadDeTemas(int cantidadDeTemas) {
			this.cantidadDeTemas = cantidadDeTemas;
		}

	
	
}
