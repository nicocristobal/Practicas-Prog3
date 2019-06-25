package Tp1;

import java.util.Scanner;

//Ejercicio nº19: Programa lea 30 temperaturas correspondientes a un mes 
//y calcule el maximo, el minimo y el promedio.

public class Ejercicio19 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de temperaturas");
		int n=scanner.nextInt();
		int[] Arreglo=new int [n];
		System.out.println("Ingrese las temperaturas: ");
		for(int i=0;i<n;i++) {
			Arreglo[i]=scanner.nextInt();
		}
		int menor,mayor;
		menor=mayor=Arreglo[0];
		for(int j=0;j<n;j++) {
			if(Arreglo[j]>mayor) 
				mayor=Arreglo[j];
			if(Arreglo[j]>menor) 
				menor=Arreglo[j];
			
			
		}
		System.out.println("Elemento mayor: "+mayor);
		System.out.println("Elemento menor: "+menor);
		
		
		}
		
		
		
		

	}


