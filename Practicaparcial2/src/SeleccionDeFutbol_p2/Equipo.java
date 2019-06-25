package SeleccionDeFutbol_p2;

public class Equipo {
	
	private Coleccion<Integrantes>listaIntegrantes;
	private int tope=24;
	
	public Equipo(Coleccion<Integrantes> listaIntegrantes, int tope) {
		super();
		this.listaIntegrantes = listaIntegrantes;
		this.tope = tope;
	}

	public void add(Integrantes i) {
		if(listaIntegrantes.tam()<tope) {
			listaIntegrantes.add(i);
		}
	}
	


}
