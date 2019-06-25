
public class Cuenta {
	
	private static int nroDeCuenta;

	private static float saldo;

	// Getter y Setter
	
	public static int getNroDeCuenta() {
		return nroDeCuenta;
	}

	public static void setNroDeCuenta(int nroDeCuenta) {
		Cuenta.nroDeCuenta = nroDeCuenta;
	}
	
	public static float getSaldo() {
		return saldo;
	}

	public static void setSaldo(float saldo) {
		Cuenta.saldo = saldo;
	}
	
	// Constructores
	public Cuenta() {
		setSaldo(0);
	}
	public Cuenta(float c) {
		setSaldo(c);
	}
	
	// Metodos
	public static void ingresar(float c) {
		saldo=saldo+c;
	}
	public static void extraer(float c) {
		saldo=saldo-c;
	}

}
