package Empleados;


public class Main {

	public static void main(String[] args) {
		Empleado carlos=new Empleado(23456345,"Carlos","Gutiérrez",25000);		
		System.out.println(carlos.imprimirEmpleado());
		System.out.println(carlos.annualSalary());
		
		Empleado ana=new Empleado(34234123,"Ana","Sanchez",27500);
		System.out.println(ana.imprimirEmpleado());
		System.out.println(ana.annualSalary());
		
		

	}

}
