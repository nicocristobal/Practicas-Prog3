package Tp1;

import java.util.Scanner;

public class Main {
	static String nombre;
	static Scanner scan; //esto es una declaracion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int numero =5;
		System.out.println("el numero es "+numero);
		sumar(1,2);
		int rta=3;
		rta=contar();
		System.out.println("la rta es "+rta);*/
		scan= new Scanner (System.in);//esto es una intancia 
		String nombre= scan.next();
		if (Main.nombre.equals(nombre))
		{
			System.out.println("es igual");
		}
	}
	private static int contar() {
		// TODO Auto-generated method stub
		return 5;
	}
	public static void sumar(int n1, int n2) {
		int rta=n1=n2;
		System.out.println("la suma es "+rta);
	}

}
