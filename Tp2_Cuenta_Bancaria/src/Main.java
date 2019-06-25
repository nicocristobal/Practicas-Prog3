
import static java.lang.System.exit;
import java.util.*;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
	
		int opcion;
		float saldo;
		float dinero;
		int contador=0;
		
		Cuenta usuario1;
		
		do {
			System.out.println("------------------------------");
			System.out.println("1.Crear cuenta vacia");
			System.out.println("2.Crear cuenta saldo inicial");
			System.out.println("3.Ingresar dinero");
			System.out.println("4.Sacar dinero");
			System.out.println("5.Ver Saldo");
			System.out.println("6.Salir");
			System.out.println("------------------------------");
			System.out.println("Ingrese Opción");
			System.out.println("------------------------------");

			opcion=scanner.nextInt();
			System.out.println();
			
			while((opcion==1 || opcion==2)&& contador>0) {
				System.out.println("Cuenta ya creada, ingrese otra opcion");
				opcion=scanner.nextInt();
				System.out.println();
			}
			while((opcion==3 || opcion==4 || opcion==5)&& contador==0) {
				System.out.println("Primero cree una cuenta, Opcion 1 o 2");
				opcion=scanner.nextInt();
				System.out.println();
			}
			
			
			switch(opcion) {
			
				case 1:
					System.out.println("Ingrese numero de cuenta: ");
					opcion= scanner2.nextInt();
					System.out.println();
					
					usuario1= new Cuenta();
					
				    System.out.println("La cuenta ha sido creada");
					System.out.println();
					
					break;
					
				case 2:
					System.out.println("Ingrese Saldo Inicial: ");
					dinero=scanner2.nextFloat();
					
					new Cuenta(dinero);
					System.out.println();
					System.out.println("Cuenta dinero");
					System.out.println();
					
					break;
				
				case 3:
					System.out.println("Ingrese monto a depositar: ");
					dinero=scanner2.nextFloat();
					
					Cuenta.ingresar(dinero);
					
					System.out.println();
					System.out.println("Monto depositado con exito");
					System.out.println();
					
					break;
					
				case 4:	
					System.out.println("Ingrese monto a extraer: ");
					dinero=scanner2.nextFloat();
					
					saldo=Cuenta.getSaldo();
					
					if(dinero<saldo)
						Cuenta.extraer(dinero);
					else {
						System.out.println();
						System.out.println("no posee esa cantidad de dinero en la cuenta");
						System.out.println();
						
						}
					break;
					
				case 5:
					saldo=Cuenta.getSaldo();
					
					System.out.println("Su saldo es de $"+saldo);
					System.out.println();
					
					
					break;
					
				case 6:
					exit(0);
					
					break;			
			}
			contador+=1;
			
		}while(true);
	
		
		
	}

}
