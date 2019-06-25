package Libro;


public class Main {

	public static void main(String[] args) {
		
		Autor joshua=new Autor("Joshua", "Bloch", "joshua@emailcom", "M");
		System.out.println(joshua.imprimir());
		
		Libro EffectiveJava = new Libro ("EffectiveJava",450,150, joshua);
		
		System.out.println(EffectiveJava.imprimir());
		
		System.out.println("Nuevo Precio: "+EffectiveJava.nuevoPrecio());
		System.out.println("Nueva Cantidad "+EffectiveJava.nuevaCantidad());
		
		System.out.println("Autor= "+EffectiveJava.imprimirAutor());
		
		System.out.println(EffectiveJava.imprimirMensaje());
		
	}

}
