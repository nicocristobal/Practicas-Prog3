package Ejercicio2;

public class EComision extends Empleado {
		
	private int clientesCaptados;
	private double montoPorCliente;
	public static final double salarioMinimo = 750;
	

    public double obtenerSalario (){
        if (montoPorCliente*clientesCaptados > salarioMinimo)
            return montoPorCliente*clientesCaptados;
        else
            return salarioMinimo;
    }

	
	public String imprimirEComision() {
		return "EComision [clientesCaptados=" + clientesCaptados + ", montoPorCliente=" + 
				montoPorCliente + "]"+super.imprimirEmpleado();
	}
	
	public EComision(String dni, String nombre, String apellido, int anioIngreso, int clientesCaptados,
			double montoPorCliente) {
		super(dni, nombre, apellido, anioIngreso);
		this.clientesCaptados = clientesCaptados;
		this.montoPorCliente = montoPorCliente;
	}
	public EComision() {
		super();
		this.clientesCaptados = 0;
		this.montoPorCliente = 0;
	}
	public int getClientesCaptados() {
		return clientesCaptados;
	}
	public void setClientesCaptados(int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}
	public double getMontoPorCliente() {
		return montoPorCliente;
	}
	public void setMontoPorCliente(double montoPorCliente) {
		this.montoPorCliente = montoPorCliente;
	}
	public static double getSalariominimo() {
		return salarioMinimo;
	}
	
	

	
	
}