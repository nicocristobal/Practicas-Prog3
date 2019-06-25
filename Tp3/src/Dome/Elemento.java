package Dome;

public class Elemento {
		private String titulo;
		private double duracion;
		private String autor;
		private boolean favorito;
		private String comentario;
		
		public String imprimirElemento(){
			return "Elemento - Titulo="+titulo+", Duracion="+duracion+", autor"+autor+
					", favorito="+favorito+", comentario="+comentario+"-";
		}
		
		public Elemento(String titulo, double duracion, String autor, boolean favorito, String comentario) {
			super();
			this.titulo = titulo;
			this.duracion = duracion;
			this.autor = autor;
			this.favorito = favorito;
			this.comentario = comentario;
		}
		public String getTitulo() {
			return titulo;
		}
		public double getDuracion() {
			return duracion;
		}
		public String getAutor() {
			return autor;
		}
		public boolean isFavorito() {
			return favorito;
		}
		public void setFavorito(boolean favorito) {
			this.favorito = favorito;
		}
		public String getComentario() {
			return comentario;
		}
		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		
		
		
}
