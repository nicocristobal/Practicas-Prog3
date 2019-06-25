package Rectangulo;

public class Main {

	public static void main(String[] args) {

		Rectangulo rectangulo=new Rectangulo(1,1);
		System.out.println(rectangulo.imprmirAnchoLargo());
		System.out.println(rectangulo.calculateArea());
		System.out.println(rectangulo.calculatePerimeter());
		
		Rectangulo rectangulo2=new Rectangulo(5,5);
		System.out.println(rectangulo2.imprmirAnchoLargo());
		System.out.println(rectangulo2.calculateArea());
		System.out.println(rectangulo2.calculatePerimeter());
		
	}

}
