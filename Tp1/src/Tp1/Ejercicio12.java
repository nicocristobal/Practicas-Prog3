package Tp1;
import java.util.Scanner;

public class Ejercicio12 {
	
	
	private static Scanner scan;
	public static double hipotenusaTrianguloRec (float cateto1, float cateto2)
	{
		return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
		
		System.out.println("A continuacion ingrese los dos numeros a multiplicar: ");
		int multiplo1= scan.nextInt();
		System.out.println(" - ");
		int multiplo2= scan.nextInt();
		float producto= multiplicar2num((float)multiplo1,(float)multiplo2);
		System.out.println("El producto de la multiplicacion entre "+multiplo1+ " y " +multiplo2+ " es " +producto);
		
		
		System.out.println("Que area desea calcular?  1-rectangulo  2-cuadrado  3-triangulo  4-circulo");
		int opcion=scan.nextInt();
		switch(opcion)
		{
			case(1):
				System.out.println("Ingrese la altura del rectangulo en centimetros: ");
				int h= scan.nextInt();
				System.out.println("la base: ");
				int b= scan.nextInt();
				System.out.println("El Area del rectangulo es : " +multiplicar2num((float)h,(float)b)+ "cm2");
				break;
	
			case(2):
				System.out.println("Ingrese la medida del lado del cuadrado en centimetros: ");
				int l = scan.nextInt();
				System.out.println("El area del cuadrado es : " +multiplicar2num((float)l,(float)l)+ "cm2");
				break;
	
			case(3):
				System.out.println("Ingrese la altura del triangulo: ");
				int a=scan.nextInt();
				System.out.println("la base: ");
				float base=scan.nextInt();
				System.out.println("El area de su triangulo es : " + (multiplicar2num((float)a,(float)base)/2) + " cm2 ");
				break;
	
			case(4):
				System.out.println("Ingrese el radio del circulo:");
				int r=scan.nextInt();
				float pi = (float)3.14;
				System.out.println("El area del circulo es: " + multiplicar2num( pi, (float)(r*r) ) + "cm2");
				break;
	
			default:
				System.out.println("Opcion incorrecta");
				break;

	}
	
	}
	public static float multiplicar2num(float multiplo1, float multiplo2)
	{
		return (float)(multiplo1 * multiplo2);
	}
}

