package futbol;

public class Masajista extends SeleccionFutbol {
	private String titulacion;
	private int aniosExperiencia;

	public Masajista(int id, String nombre, String apellidos, int edad,  String Titulacion, int AniosExperiencia) {
		super(id, nombre, apellidos, edad);
		titulacion = Titulacion;
		aniosExperiencia = AniosExperiencia;
		// TODO Auto-generated constructor stub
	}

	// constructor, getter y setter

	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un Masaje");
	}
}