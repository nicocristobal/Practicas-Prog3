package Tp1;

import java.util.Scanner;
//Ejercicio nº3: Mostrar los primeros 100 números primos.
public class Ejercicio03 {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner (System.in);
		
		int limite;
		System.out.println("Ingrese un numero");
		limite=leer.nextInt();
		
		
		for(int i=1; i<limite; i++) {
			int count=0;
			for(int j=1; j<=i;j++)
				count++;
			
			if(count==2)
				System.out.println(i);
		}
		
		
		

	}

}
