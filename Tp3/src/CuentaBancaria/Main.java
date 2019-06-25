package CuentaBancaria;


public class Main {

	public static void main(String[] args) {
		Cliente nicolas=new Cliente(123,"Nicolas","M");
		System.out.println(nicolas.imprimirCliente());
	
		Cuenta cuenta=new Cuenta("Banco",10000,nicolas);
		System.out.println(cuenta.imprimirCuenta());
		
		
	
	
	
	}

}
