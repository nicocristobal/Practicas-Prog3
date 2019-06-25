package Ejercicio1;

public class Persona {
	
	//Constantes
	private final static char SEXO_DEF='H';// sexo por defecto
	public static final int INFRAPESO=-1;// el peso de la persona esta por debajo del peso ideal
	public static final int PESO_IDEAL=0;// el peso de la persona esta en su peso ideal
	public static final int SOBREPESO=1;// el peso de la persona esta por encima del peso ideal
	
	//Atributos
	private String nombre;
	private int edad;
	private static  String dni;
	private char sexo;
	private double peso;
	private double altura;
	

	// Contructor por defecto
	public Persona() {
		this("",0,"", SEXO_DEF,0,0);
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this(nombre,edad,dni,sexo,0,0);
	}

	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		Persona.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		generarDNI();
		comprobarSexo();
	}
	
	private void comprobarSexo() {
		if(sexo!='H' && sexo!='M')
			this.sexo=SEXO_DEF;
	}
	
	  private char generaLetraDNI(int res) {
	        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
	            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
	            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	 
	        return letras[res];
	    }
	 	
	private void generarDNI() {
		final int divisor=23; 
		
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
 
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
 
        //Pasamos el DNI a String
        dni = Integer.toString(numDNI) + letraDNI;
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public int calcularIMC() {
		double pesoActual=peso/Math.pow(altura, 2);
		
		if(pesoActual>=20 && pesoActual<=25)
			return PESO_IDEAL;
		else 
			if (pesoActual<20)
				return INFRAPESO;
			else
				return SOBREPESO;
	}
	
	public boolean esMayorEdad() {
		boolean mayor=false;
		if(edad>=18)
			mayor=true;
		return mayor;
	}

	@Override
	public String toString() {
		String sexo;
		if(this.sexo=='H')
			sexo="Hombre";
		else
			sexo="Mujer";
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	
	
	
	

	
}
