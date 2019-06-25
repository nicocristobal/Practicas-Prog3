package EmpresaAgroAlimentaria;

public class ProductoFresco extends Producto {
	private String fechaEnvasado;
	private String paisOrigen;
		
	
	@Override
	public String toString() {
		return "ProductoFresco [fechaEnvasado=" + getFechaEnvasado() + ", paisOrigen=" + getPaisOrigen() + "]"
				+ ""+super.toString();
	}

	public ProductoFresco() {
		super();
		fechaEnvasado = "";
		paisOrigen = "";
	}
	
	public ProductoFresco(String codigoInterno, String fechaCaducidad, String numeroLote, String fechaEnvasado,
			String paisOrigen) {
		super(codigoInterno, fechaCaducidad, numeroLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	public ProductoFresco(ProductoFresco fresco, String otroCodigo, String paisOrigen) {
		super(otroCodigo,fresco.getFechaCaducidad(),fresco.getNumeroLote());
		this.fechaEnvasado = fresco.getFechaEnvasado();
		this.paisOrigen = paisOrigen;
	}
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
}
