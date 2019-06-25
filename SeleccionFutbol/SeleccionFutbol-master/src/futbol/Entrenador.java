package futbol;

public class Entrenador extends SeleccionFutbol {
	private int idFederacion;

	public Entrenador(int id, String nombre, String apellidos, int edad, int IdFederacion) 
	{
		super(id, nombre, apellidos, edad);
		idFederacion = IdFederacion;
	}

	@Override
	public void entrenamiento() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	}

	@Override
	public void partidoFutbol() {
		System.out.println("Dirige un Partido (Clase Entrenador)");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento");
	}

	/**
	 * @return the idFederacion
	 */
	public int getIdFederacion() {
		return idFederacion;
	}

	/**
	 * @param idFederacion the idFederacion to set
	 */
	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	
}