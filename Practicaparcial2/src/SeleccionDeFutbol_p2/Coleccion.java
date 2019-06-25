package SeleccionDeFutbol_p2;

import java.util.ArrayList;

public class Coleccion <T>{
	
	private ArrayList<T>lista=new ArrayList<T>();
	private int tamanio=24;
	
	
	public Coleccion(ArrayList<T> lista, int tamanio) {
		super();
		this.lista = lista;
		this.tamanio = tamanio;
	}


	public Coleccion() {
		super();
		this.lista = new ArrayList<T>();
		this.tamanio = lista.size();
	}
	
	public void add (T obj) {
		if(tamanio<lista.size()) {
			lista.add(obj);
		}
	}
	
	public void quitar(T obj) {
		if(obj.equals(obj)) {
			lista.remove(obj);
		}
	}
	
	public String listar() {
		String todo="";
		for(T aux:lista) {
			todo=todo.concat(aux.toString());
		}
		return todo;
	}
	
	public int tam() {
		return lista.size();
	}
	
	
	
	

}
