package Tp1;

//Ejercicio nº14: Escribir un programa que lea un número entero por teclado 
//y obtenga y muestre por pantalla el doble y el triple de ese número.

import java.util.Scanner;

public class Ejercicio14 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		int numero;
		System.out.println("Ingresa el numero");
		numero=scanner.nextInt();
		
		int multiplicacion2=numero*2;
		System.out.println("El doble es: "+multiplicacion2);
		
		int multiplicacion3=numero*3;
		System.out.println("El triple es: "+multiplicacion3);
		
	}

}
