package VideoClub;

import java.util.ArrayList;

public class VideoClub {
	
	private ArrayList<Producto>producto;
	private ArrayList<Cliente>cliente;
	
	public VideoClub() {
		producto=new ArrayList<Producto>();
		cliente=new ArrayList<Cliente>();
	}
	
  	public int contarProducto(){
		int contador = 0;
		for (Producto p : producto)
		{
			if (p instanceof Producto) contador++;
		}
		return contador;
	}
  	
  	public int contarCliente() {
  		int contador=0;
  		for(Cliente c:cliente) {
  			if(c instanceof Cliente)contador++;
  		}
  		return contador;
  	}
  	
	public void agregarProducto(Producto p) {
		producto.add(p);
	}
	public void agregarCliente(Cliente c) {
		cliente.add(c);
	}
	public void listarElementos() {
		for (Producto p:producto) {
			System.out.println(p.imprimirProducto());
		}
		for (Cliente c:cliente) {
			System.out.println(c.imprimirCliente());
		}
	}
}