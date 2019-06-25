package Tp1;
import javax.swing.JOptionPane;

// Ejercicio nº11: Multiplicar dos números

public class Ejercicio11 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog(null, "Ingrese un numero:");
		String num2=JOptionPane.showInputDialog(null, "Ingrese un el 2 numero:");
		float N1,N2,multi;
		N1=Float.parseFloat(num1);
		N2=Float.parseFloat(num2);
		multi=N1*N2;
		JOptionPane.showConfirmDialog(null, "el resultado de la multiplicacion es: "+multi);

	}

}
