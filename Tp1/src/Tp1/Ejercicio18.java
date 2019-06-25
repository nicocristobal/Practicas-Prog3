package Tp1;

import java.util.Scanner;

//Ejercicio nº18: Programa lea la longitud de los catetos de un triángulo rectángulo
// y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

public class Ejercicio18 {

	private static Scanner scanner;

	public static void main(String[] args) {
		double c,b,solucion;
		scanner = new Scanner (System.in);
		System.out.println("Ingrese el numero1");
		c=scanner.nextDouble();
		System.out.println("Ingrese el numero2");
		b=scanner.nextDouble();
		
		solucion=(c*c)+(b*b);
		solucion=Math.sqrt(solucion);
		System.out.println("la Solucion es:"+solucion);

	}

}
