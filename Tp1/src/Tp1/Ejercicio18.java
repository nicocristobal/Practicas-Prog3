package Tp1;

import java.util.Scanner;

//Ejercicio n�18: Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo
// y calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras.

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
