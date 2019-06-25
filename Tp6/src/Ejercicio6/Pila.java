package Ejercicio6;

import java.util.NoSuchElementException;

public class Pila implements ColeccionInterface{

	private Object[]array;
	private int contador;
	
	public Pila(int tamanioMaximo) {
		array =new Object[tamanioMaximo];
		contador=0;
	}

	@Override
	public boolean estaVacia() {
		return contador==0;
	}

	@Override
	public boolean anaidir(Object objeto) {
		if(contador==array.length) 
			return false;
		else
			array[contador]=objeto;
		contador++;
		return true;
	}

	@Override
	public Object primero() {
		if(estaVacia())
			throw new NoSuchElementException();
		else
			return array[contador-1];
	}

	@Override
	public Object extraer() {
		if(estaVacia())
			throw new NoSuchElementException();
		else
			return array[-contador];
	}
	
	public String toString() {
		String s="[";
		for(int i= contador -1; i>=0;i--)
			s+=array[i].toString()+",";
		if(!estaVacia())
			return s.substring(0,s.length()-1)+"]";
		else
			return s+"]";
	}


	
}
