package Tp1;

// Mostrar los primeros n números primos.

import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		
		int limite;
		System.out.println("Ingrese un numero: ");
		limite=scanner.nextInt();
		System.out.println("1");
		for(int i=1;i<limite;i++) {
			int contador=0;
			
			for(int j=1;j<i;j++) {
				if(i%j==0) 
					contador++;
			}
			if(contador==2)
				System.out.println(i);
		}
		
	}

}
