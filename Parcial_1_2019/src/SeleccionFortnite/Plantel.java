package SeleccionFortnite;

import java.util.ArrayList;

public class Plantel {
	
	private ArrayList<Persona>persona;
	
	private final int cantMaximaEntrenadores = 1;
	
	public Plantel() {
		persona=new ArrayList<>();
	}
	/*
	public boolean agregarMiembrosPlanter(Persona persona) {
		boolean rta=false;
		if(persona!=null) {
			if(persona instanceof Jugador) {
				rta=verificarJugador((Jugador)persona);
				if(rta) {
					persona.add
				}
			}
		}
	}*/
	
	public int contarVictoriasJugadores() {
		int contador=0;
		for(Persona persona:persona)
			if(persona instanceof Jugador)
				contador=contador+((Jugador)persona).getCantidadDeVictorias();
		return contador;
	}
	
	public String listarTodosLosMiembros() {
		StringBuilder builder= new StringBuilder();
		for(Persona persona : persona) {
			builder.append(persona.toString());
		}
		return builder.toString();
	}
	
	public String listarUnTipoEnParticular(int tipo) {
		StringBuilder builder =new StringBuilder();
		for(Persona persona : persona) {
			if((tipo==1)&&(persona instanceof Jugador))
				builder.append(persona.toString());
			if((tipo==2)&&(persona instanceof Entrenador))
				builder.append(persona.toString());
			if((tipo==3)&&(persona instanceof SoporteTecnico))
				builder.append(persona.toString());
		}
		return builder.toString();
	}
		
	public String listarMiembros(Jugador j) {
		StringBuilder builder= new StringBuilder();
		for(Persona persona : persona) {
			if(persona instanceof Jugador)
				builder.append(persona.toString());
		}
		return builder.toString();
	}
	
	public String listarMiembros(Entrenador j) {
		return "";
	}
	public String listarMiembros(SoporteTecnico j) {
		return "";
	}
	public String listarJugadores() {
		StringBuilder builder=new StringBuilder();
		for(Persona persona : persona) {
			if(persona instanceof Jugador) {
				builder.append(persona.toString());
			}
		}
		return builder.toString();
	}
	
	
	public boolean verificarJugador(Jugador jugador) {
		boolean rta=true;
		for(Persona persona : persona) {
			if(persona instanceof Jugador) {
				if(persona.equals(jugador))
					rta=false;
			}
		}
		return rta;
	}

	public boolean verificarEntrenador() {
		boolean rta=true;
		int contador=0;
		for(Persona persona:persona) {
			if(persona instanceof Entrenador) {
				contador++;
			}
		}
		if(contador>cantMaximaEntrenadores)rta=false;
		return rta;
	}
	
}
