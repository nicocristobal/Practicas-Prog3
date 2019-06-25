package Tp1;

//Ejercicio nº10: Encontrar el valor ASCII de un carácter.

import java.util.Scanner;

public class Ejercicio10 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		
		System.out.println("Ingresa Caracter: ");
		char caracter=scanner.next().charAt(0);
		int ascii=(int)caracter;
		System.out.println("El caracter: "+caracter+" Tiene el codigo ASCII:  "+ascii);

	}

}
