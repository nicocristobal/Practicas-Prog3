package Venta;

public class Main {

	public static void main(String[] args) {
		Venta venta=new Venta("Mesa","Redonda",15,3000);
		System.out.println(venta.SumaPrecioTotal());
		System.out.println(venta.imprimirProducto());

	}

}
