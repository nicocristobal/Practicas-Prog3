package Tp1;

//Ejercicio nº15: Programa que lea una cantidad de grados centígrados y 
//la pase a grados Fahrenheit. La fórmula correspondiente 
//para pasar de grados centígrados a fahrenheit es:  F = 32 + ( 9 * C / 5)

import java.util.Scanner;

public class Ejercicio15 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		float Grados;
		System.out.println("Ingrese los Grados centígrados : ");
		Grados=scanner.nextInt();
		
		System.out.println("Pasados a Fahrenheit es: "+((Grados*9)/5+32) + "°F");

	}

}
