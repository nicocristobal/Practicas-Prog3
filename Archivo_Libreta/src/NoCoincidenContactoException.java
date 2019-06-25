
public class NoCoincidenContactoException extends Exception {
	// La clave que no tiene coincidencias.
	private String clave;

	/**
	 * Almacena los datos err�neos.
	 * 
	 * @param clave
	 *            La clave que no coincide.
	 */
	public NoCoincidenContactoException(String clave) 
	{
		super(clave);
		this.clave = clave;
	}

	/**
	 * @return La clave err�nea.
	 */
	public String getClave() {
		return clave;
	}

	/**
	* @return Una cadena de diagn�stico que contiene
	la clave err�nea.
	*/
	public String toString()
	{
	return "No se encontraron datos que coincidan con : " + clave ;
	}
}