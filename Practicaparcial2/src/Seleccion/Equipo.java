package Seleccion;

public class Equipo {

	private Coleccion<Integrante>listaIngrantes;
	private int tope=24;
	
	public Equipo(Coleccion<Integrante> listaIngrantes, int tope) {
		super();
		this.listaIngrantes = listaIngrantes;
		this.tope = tope;
	}
	
	public void add(Integrante i) {
		if(listaIngrantes.tam()<tope)
			listaIngrantes.add(i);
	}
}
