package Tp1;

//Ejercicio nº13: Programa que lea un nombre y muestre por pantalla:
//“Buenos dias nombre_introducido”.

import java.util.Scanner;

public class Ejercicio13 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		String nombre;
		System.out.println("Ingresa el Nombre");
		nombre=scanner.next();
		System.out.println("Buenos dias "+nombre);
	}

}
