package Tp1;

//Ejercicio nº21:  Crea una aplicación que nos pida un día de la semana 
//y que nos diga si es un día laboral o no. Usa un switch para ello

import java.util.Scanner;

public class Ejercicio21 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int dia;
		System.out.println("Ingrese numero del dia :\n 1 lunes\n 2 Martes\n 3 Miecoles\n"
				+ " 4 Jueves\n 5 Viernes\n 6 Sabado\n 7 Domingo ");
		dia=scanner.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes - Dia laborable");
			break;
		case 2:
			System.out.println("Martes - Dia laborable");
			break;
		case 3:
			System.out.println("Miercoles - Dia laborable");
			break;
		case 4:
			System.out.println("Jueves - Dia laborable");
			break;
		case 5:
			System.out.println("Viernes - Dia laborable");
			break;
		case 6:
			System.out.println("Sabado - Dia No laborable");
			break;
		case 7:
			System.out.println("Domino - Dia No laborable");
			break;
		default:
			System.out.println("No existe ese numero de dia");
		
		}

	}

}
