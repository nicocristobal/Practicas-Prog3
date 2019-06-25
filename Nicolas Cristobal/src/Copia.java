import java.util.ArrayList;

public class Copia {
	private ArrayList<Jugadores>jugadores;
	private ArrayList<Entrenador>entrenador;
	private ArrayList<SoporteTecnico>soporteTecnico;
	
	public Copia() {
		jugadores=new ArrayList<Jugadores>();
		entrenador=new ArrayList<Entrenador>();
		soporteTecnico=new ArrayList<SoporteTecnico>();
	}

	public int contarCantVict() {
		int contador=0;
		for(Jugadores j:jugadores)
			if(j instanceof Jugadores)
				contador= contador+j.getCantDeVictorias();
		return contador;
	}
	
	 public void agregar(Persona p) {
		if (p instanceof Jugadores) 
			jugadores.add((Jugadores)p);
		else if(p instanceof Entrenador)
			entrenador.add((Entrenador) p);
		else if(p instanceof SoporteTecnico)
			soporteTecnico.add((SoporteTecnico)p);
	}	 
		
	public void ListarElementos() {
		for(Jugadores p:jugadores)
			System.out.println(p.imprimirPersona());
		for(Entrenador p:entrenador)
			System.out.println(p.imprimirPersona());
		for(SoporteTecnico p:soporteTecnico)
			System.out.println(p.imprimirPersona());
	}

}
