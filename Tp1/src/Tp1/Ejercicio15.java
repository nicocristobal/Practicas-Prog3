package Tp1;

//Ejercicio n�15: Programa que lea una cantidad de grados cent�grados y 
//la pase a grados Fahrenheit. La f�rmula correspondiente 
//para pasar de grados cent�grados a fahrenheit es:  F = 32 + ( 9 * C / 5)

import java.util.Scanner;

public class Ejercicio15 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		float Grados;
		System.out.println("Ingrese los Grados cent�grados : ");
		Grados=scanner.nextInt();
		
		System.out.println("Pasados a Fahrenheit es: "+((Grados*9)/5+32) + "�F");

	}

}
