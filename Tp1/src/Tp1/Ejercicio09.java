package Tp1;

import java.util.Scanner;

// Ejercicio nº9: Revisar si un año es bisiesto o no.

public class Ejercicio09 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		int ano;
		System.out.println("Ingresa el año");
		ano=scanner.nextInt();
		
		if((ano % 4==0 && ano %100!=0) || ano %400 ==0)
			System.out.println("es un año biciestro");
		else
			System.out.println("No es un año biciestro");
		

	}

}
