package EmpresaAgroAlimentaria;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Producto>productos;
	
	public Empresa() {
		super();
		productos= new ArrayList<Producto>();
	}
	
	public boolean verificacionDeCodigo(Producto producto) {
		if(productos.contains(producto))
			return false;
		else
			return true;
	}
	
	public boolean agregarProductos(Producto producto) {
		boolean rta=false;
		if(verificacionDeCodigo(producto)){
			productos.add(producto);
			rta=true;
		}
		return rta;
	}
	
	public int contarCantidadPorTipo(int TipoElegido) {
		int contador=0;
		for(Producto producto: productos) {
			if((TipoElegido==1)&&(producto instanceof ProductoFresco))
				contador++;
			else
				if((TipoElegido==2)&&(producto instanceof ProductoCongelado))
					contador++;
				else
					if((TipoElegido==3)&&(producto instanceof ProductoRefrigerado))
						contador++;
			;
		}
		return contador;
	}
	
	public int contarCongelados() {
		int contador=0;
		for(Producto producto: productos) {
			if(producto instanceof ProductoCongelado)
				contador++;
		}
		return contador;
	}
	
	public int contarFrescos() {
		int contador=0;
		for(Producto producto :productos) {
			if(producto instanceof ProductoFresco)
				contador++;
		}
		return contador;
	}
	public int contarRefrigerados() {
		int contador=0;
		for(Producto producto:productos) {
			if(producto instanceof ProductoRefrigerado)
				contador++;
		}
		return contador;
	}
	
	public String mostrarTodo() {
		StringBuilder stringBuilder=new StringBuilder();
		for(Producto producto:productos) {
			stringBuilder.append(producto.toString());
		}
		return stringBuilder.toString();
	}
	
	public String mostrarTodo2() {
		String choclo="";
		for(Producto producto:productos)
			choclo.concat(producto.toString());
		return choclo;
	}
	
	public String mostrarPorTipo(int tipo) {
		StringBuilder stringBuilder=new StringBuilder();
		for(Producto producto:productos) {
			if((tipo==1)&&(producto instanceof ProductoFresco))
				stringBuilder.append(producto.toString());
			else
				if((tipo==2)&&(producto instanceof ProductoRefrigerado))
					stringBuilder.append(producto.toString());
				else
					if((tipo==3)&& (producto instanceof ProductoCongelado))
						stringBuilder.append(producto.toString());
					
		}
		return stringBuilder.toString();
	}
	
	public String mostrarFrescos() {
		StringBuilder stringbuilder=new StringBuilder();
		for(Producto producto:productos) {
			if(producto instanceof ProductoFresco)
				stringbuilder.append(producto.toString());
		}
		return productos.toString();
	}
	
	public String mostrarCongelador() {
		StringBuilder stringBuilder=new StringBuilder();
		for(Producto producto:productos) {
			if(producto instanceof ProductoCongelado)
				stringBuilder.append(producto.toString());
		}
		return stringBuilder.toString();
	}
	
	public String mostrarRefrigerados() {
		StringBuilder stringBuilder=new StringBuilder();
		for(Producto producto:productos) {
			if(producto instanceof ProductoRefrigerado)
				stringBuilder.append(producto.toString());
		}
		return stringBuilder.toString();
	}

	@Override
	public String toString() {
		return mostrarPorTipo(1)+mostrarPorTipo(2)+mostrarPorTipo(3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
