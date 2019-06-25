package futbol;

public class Futbolista extends SeleccionFutbol 
{
	
	private int dorsal;
	private String demarcacion;

	public Futbolista(int id, String nombre, String apellidos, int edad, int Dorsal, String Demarcacion) 
	{
		super(id, nombre, apellidos, edad);
		dorsal = Dorsal;
		demarcacion = Demarcacion;
	}


	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}
	
	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param dorsal
	 *            the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * @return the demarcacion
	 */
	public String getDemarcacion() {
		return demarcacion;
	}

	/**
	 * @param demarcacion
	 *            the demarcacion to set
	 */
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
}
