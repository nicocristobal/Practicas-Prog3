package Empleados;

public class Empleado {

	private int dni;
	private String name ;
	private String surname;
	private double salary;
	
	public String imprimirEmpleado() {
		return "DNI= " + dni + ", Name= " + name + ", Surname= " + surname +", Salary= "+salary ;
	}
	
	public float annualSalary() {
		return (float) (salary*12);
	}
	
	
	public Empleado(int dni, String name, String surname, double salary) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
