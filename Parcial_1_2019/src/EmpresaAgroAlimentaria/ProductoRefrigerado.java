package EmpresaAgroAlimentaria;

public class ProductoRefrigerado extends Producto {
	private String codigoAlimentario;
	
	
	
	@Override
	public String toString() {
		return "ProductoRefrigerado [codigoAlimentario=" + codigoAlimentario + "]"+super.toString();
	}

	public ProductoRefrigerado(String codigoAlimentario) {
		super();
		codigoAlimentario = "";
	}
		
	public ProductoRefrigerado(String codigoInterno, String fechaCaducidad, String numeroLote,
			String codigoAlimentario) {
		super(codigoInterno, fechaCaducidad, numeroLote);
		this.codigoAlimentario = codigoAlimentario;
	}
	
	public ProductoRefrigerado(Producto otroProducto, Producto otroCodigo, String codigoAlimentario) {
		super(otroProducto, otroCodigo);
		this.codigoAlimentario = codigoAlimentario;
	}

	public String getCodigoAlimentario() {
		return codigoAlimentario;
	}
	public void setCodigoAlimentario(String codigoAlimentario) {
		this.codigoAlimentario = codigoAlimentario;
	}
	

}
