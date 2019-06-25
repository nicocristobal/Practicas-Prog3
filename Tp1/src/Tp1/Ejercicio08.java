package Tp1;

import java.util.Scanner;

public class Ejercicio08 {
	
	public static int cantidadDingresos()
	{
		int cantidad=0;
		int num;
		Scanner scann = new Scanner(System.in);
		char control= 's';
		while(control=='s')
		{
			System.out.println("Ingrese un numero: ");
			num = scann.nextInt();
			if(num % 2 == 0)
			{
				cantidad++;
			}
			System.out.println("Para continuar ingresando numeros presione 's' : ");
			control=scann.next().charAt(0);
		}
		scann.close();
		return cantidad;
	}
	
	public static void main(String[] args) {
	int cantidad=cantidadDingresos();
	System.out.println("Cantidad de numeros pares ingresados: " +cantidad);
	}
}
