package CuentaBancaria;

public class Cuenta {
	private String identificador;
	private static float balance;//metodos depositar extraer
	private Cliente cliente;
		
	public Cuenta(String identificador, float balance, Cliente cliente) {
		
		this.identificador = identificador;
		Cuenta.balance = balance;
		this.cliente = cliente;
	}
	
	public String imprimirCuenta() {
		return "Indentificador= " + identificador + ", Balance= " + balance + ", Cliente=" + cliente.getNombre() ;
	}

	public static void ingresar(float c) {
		balance=balance+c;
	}
	public static void extraer(float c) {
		balance=balance-c;
	}
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
