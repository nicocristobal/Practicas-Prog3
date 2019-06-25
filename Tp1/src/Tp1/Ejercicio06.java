package Tp1;

import java.util.Scanner;
//Ejercicio 6//Ingresar un número o tantos como quiera el usuario y revisar si es primo
public class Ejercicio06 {


	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner (System.in);
		System.out.println("Ingrese un numero:");
		int num =scanner.nextInt();
		int num2 =num-1;
		
		while ((num % num2)!=0) {
			num2--;
		}
		
		
		if(num2==1) 
			System.out.println("Es primo");
		else 
			System.out.println("No es primo");
		
	

	
		
	}
}
