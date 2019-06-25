package EmpresaAgroAlimentaria;

public class Producto {
	private String codigoInterno;
	private String fechaCaducidad;
	private String numeroLote;
			
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null) {
			if(obj instanceof Producto) {
				Producto producto=(Producto)obj;
				if(producto.getCodigoInterno().equals(getCodigoInterno())) 
					return true;
				else
					return false;			
			}
			else
				return false;
		}
		else
			return false;
			
	}

	@Override
	public String toString() {
		return "Producto [codigoInterno=" + getCodigoInterno() + ", fechaCaducidad=" + getFechaCaducidad() + ", "
				+ "numeroLote=" + getNumeroLote() + "]";
	}

	// CONTRUCTO VACIO	
	public Producto() {
		super();
		codigoInterno = "";
		fechaCaducidad = "";
		numeroLote = "";
	}
	 
	// CONTRUCTOR COMPLETO
	public Producto(String codigoInterno, String fechaCaducidad, String numeroLote) {
		super();
		this.codigoInterno = codigoInterno;
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}
	
	// CONSTRUCTOR DE COPIA
	public Producto(Producto otroProducto, Producto otroCodigo) {
		super();
		setFechaCaducidad(otroProducto.getFechaCaducidad());
		setCodigoInterno(otroCodigo.getCodigoInterno());
		setNumeroLote(otroProducto.getFechaCaducidad());
		
	}

	public String getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	
	

}
