package Tp1;

//Ejercicio nº7: Encontrar la suma de los primeros 10 números naturales.


public class Ejercicio07 {
 
	private int num,cont;
		
	public void Calcular() {
		
		
		while(cont<=10) {
			num=num+cont;
			System.out.println(cont+"+");
			cont++;
		}
	}
	public void Mostrar() {
		System.out.println();
		System.out.println("la suma es:"+num);
		
	}
	public static void main(String[] args) {
		Ejercicio07 obs=new Ejercicio07();
		obs.Calcular();
		obs.Mostrar();
	}

}
