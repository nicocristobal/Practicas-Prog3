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
	 
	 public Venta(String identificador, String descripci�n, int cantidad, float precioUnitario) {
		super();
		this.identificador = identificador;
		this.descripcion = descripci�n;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getDescripci�n() {
		return descripcion;
	}
	public void setDescripci�n(String descripci�n) {
		this.descripcion = descripci�n;
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
