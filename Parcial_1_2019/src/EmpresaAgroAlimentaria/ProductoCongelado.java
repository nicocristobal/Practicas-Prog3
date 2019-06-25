package EmpresaAgroAlimentaria;

public class ProductoCongelado extends Producto{
	private int temperatura;

	@Override
	public String toString() {
		return "ProductoCongelado [temperatura=" + temperatura + "]"+super.toString();
	}
	public ProductoCongelado(String temperatura) {
		super();
		temperatura = "";
	}
	public ProductoCongelado(String codigoInterno, String fechaCaducidad, String numeroLote, int temperatura) {
		super(codigoInterno, fechaCaducidad, numeroLote);
		this.temperatura = temperatura;
	}
	public ProductoCongelado(Producto otroProducto, Producto otroCodigo, int temperatura) {
		super(otroProducto, otroCodigo);
		this.temperatura = temperatura;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
}
