package Tp1;

/*Ejercicio nº16: Programa que lea por teclado el valor del radio de una circunferencia 
y calcula y muestra por pantalla la longitud y el área de la circunferencia. 
Investigar el uso de la librería Math.
Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2 */

import java.util.Scanner;

public class Ejercicio16 {
		Scanner scanner= new Scanner(System.in);
		
		public Ejercicio16() {
		double rad, area, longitud;
		
		System.out.println("Ingrese el radio de la circunferencia: ");
		rad=scanner.nextDouble();
		
		area=Math.PI*Math.pow(rad, 2);
		longitud=2*Math.PI*rad;
		
		System.out.println("El area de la circunferencia: "+area);
		System.out.println("La longuitud de la circunferencia: "+longitud);
		
	}
	public static void main(String[] args) {
		new Ejercicio16();
		

	}

}

