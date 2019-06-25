
public class DatosDelContacto {
	private String nombre;
	private String telefono;
	private String direccion;

	/**
	 * Prepara los datos del contacto. A todos los datos se les elimina los
	 * espacios en blanco al comienzo y al final. El nombre y el tel�fono no
	 * pueden ser simult�neamente cadenas vac�as.
	 * 
	 * @param nombre
	 *            El nombre.
	 * @param telefono
	 *            El n�mero de tel�fono.
	 * @param direccion
	 *            La direcci�n.
	 * @throws Illegal
	 *             StateException Si el nombre y el tel�fono est�n vac�os.
	 */
	public DatosDelContacto(String nombre, String telefono, String direccion) {
		// Usa cadenas vac�as si alguno de los argumentos es null.
		if (nombre == null) {
			nombre = "";
		}
		if (telefono == null) {
			telefono = "";
		}
		if (direccion == null) {
			direccion = "";
		}
		this.nombre = nombre.trim();
		this.telefono = telefono.trim();
		this.direccion = direccion.trim();
		if (this.nombre.length() == 0 && this.telefono.length() == 0) {
			throw new IllegalStateException("El nombre y el tel�fono no pueden estar vac�os.");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

}
