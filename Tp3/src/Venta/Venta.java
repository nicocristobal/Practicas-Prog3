package Venta;

public class Venta {
	
	 private String identificador; 
	 private String descripcion;
	 private int cantidad;
	 private float precioUnitario;
	
	 public float SumaPrecioTotal() {
		 return cantidad*precioUnitario;
	 }
	 public String imprimirProducto() {
		 return "ItemVenta [Id=" + identificador + ", Descripcion=" + descripcion +
				 ", Cantidad=" + cantidad + ", PrecioUnitario=" + precioUnitario +"]";
	 }
	 
	 public Venta(String identificador, String descripción, int cantidad, float precioUnitario) {
		super();
		this.identificador = identificador;
		this.descripcion = descripción;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getDescripción() {
		return descripcion;
	}
	public void setDescripción(String descripción) {
		this.descripcion = descripción;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	 

	
}
