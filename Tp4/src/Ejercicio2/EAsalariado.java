package Ejercicio2;

import java.util.Calendar;

public class EAsalariado extends Empleado{
	
	private double sueldoBasico;
	
	public double obtenerSalario (){
        Calendar now = Calendar.getInstance();
        int actualYear = now.get(Calendar.YEAR);
        int anios = actualYear - getAnioIngreso(); 
        if (anios<0){
            System.out.println("Error: n�mero de a�os negativo");
        }
        if (anios < 2) return sueldoBasico;
        else if (anios >= 2 && anios<=3) return sueldoBasico * 0.05 + sueldoBasico;
        else if (anios >= 4 && anios<=7) return sueldoBasico * 0.10 + sueldoBasico;
        else if (anios >= 8 && anios<=15) return sueldoBasico * 0.15 + sueldoBasico;
        else return sueldoBasico * 0.20 + sueldoBasico;        
    }
 	
		
	
	public String imprimirEAsalariado() {
		return "EAsalariado [sueldoBasico=" + sueldoBasico + "]"+super.imprimirEmpleado();
	}
	
	
	public EAsalariado(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
		super(dni, nombre, apellido, anioIngreso);
		this.sueldoBasico = sueldoBasico;
	}
	// Constr Vacio
	public EAsalariado() {
		super();
		sueldoBasico = 0;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
	
}
