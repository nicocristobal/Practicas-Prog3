package Dome;

import java.util.ArrayList;

public class Catalogo {
	
	ArrayList<Elemento>elementos;
	
	public catalogo() {
		elementos=new ArrayList<>();
	}
	public void agregarElemento(elemento a) {
		elementos.add(a);
	}
	public void listarCatalogo() {
		for(Elemento e: elementos)
			System.out.println(e.imprimirElemento());
	}
}
