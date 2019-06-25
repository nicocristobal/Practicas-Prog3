package SeleccionDeFutbol_p2;

public class Masajista extends Integrantes implements Juego, Asistencia{

	private String titulo;
	private int anioExperiencia;
	
		
	
	
	@Override
	public String estoyViajando() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return super.estoyViajando();
	}

	@Override
	public String estoyConcentrar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return super.estoyConcentrar();
	}

	@Override
	public String darAsistencia() {
		return "Dando asistencia";
	}

	@Override
	public int jugar() {
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + anioExperiencia;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Masajista other = (Masajista) obj;
		if (anioExperiencia != other.anioExperiencia)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Masajista [titulo=" + titulo + ", anioExperiencia=" + anioExperiencia + "]"+super.toString();
	}

	// constr
	public Masajista(String nombre, String apellido, int edad, String titulo, int anioExperiencia) {
		super(nombre, apellido, edad);
		this.titulo = titulo;
		this.anioExperiencia = anioExperiencia;
	}
	
	// costr vacio
	public Masajista() {
		super();
		titulo = "";
		anioExperiencia = 0;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnioExperiencia() {
		return anioExperiencia;
	}
	public void setAnioExperiencia(int anioExperiencia) {
		this.anioExperiencia = anioExperiencia;
	}
	
	
	
}