package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		A a;
	    B b = new B();
	    C c = new C();
	    System.out.print( "Métodos llamados con objeto b desde ");
	    System.out.println("referencia de la clase A");
	    a = b;
	    a.dinamica();
	    a.estatica();
	    System.out.print( "Métodos llamados con objeto c desde ");
	    System.out.println(" referencia de la clase A");
	    a = c;
	    a.dinamica();
	    a.estatica();


	}

}
