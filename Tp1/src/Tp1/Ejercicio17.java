package Tp1;

//Ejercicio nº17: Programa que pase una velocidad en Km/h a m/s. 
//La velocidad se lee por teclado.

import java.util.Scanner;

public class Ejercicio17 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		float velocidad;
		System.out.println("Ingrese la velocidad en KM/HS: ");
		velocidad=scanner.nextInt();
		
		System.out.println("La velocidad en M/S es: "+velocidad*1000/3600+ "m/s");

	}

}
