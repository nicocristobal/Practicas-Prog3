package Seleccion;

public class Masajista extends Integrante implements Asistencia{

	private String titulo;
	private int anioExperiencia;
	
	
	
	@Override
	public String darAsistencia() {
		return null;
	}
	@Override
	public String Viajar() {
		return super.Viajar();
	}
	@Override
	public String Concentrar() {
		return super.Concentrar();
	}

	@Override
	public String toString() {
		return "Masajista [titulo=" + titulo + ", anioExperiencia=" + anioExperiencia + "]"+super.toString();
	}

	public Masajista(String nombre, String apellido, int edad, String titulo, int anioExperiencia) {
		super(nombre, apellido, edad);
		setTitulo(titulo);
		setAnioExperiencia(anioExperiencia);
	}
	
	public Masajista(String titulo, int anioExperiencia) {
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
