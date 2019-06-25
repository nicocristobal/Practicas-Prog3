package futbol;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		SeleccionFutbol bianchi = new Entrenador(1, "Carlos", "Bianchi", 60, 28489);
		SeleccionFutbol messi = new Futbolista(2, "Lionel", "Messi", 29, 10, "El DIEZ");
		SeleccionFutbol raulMartinez = new Masajista(3, "Ra�l", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
		
		integrantes.add(bianchi);
		integrantes.add(messi);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo m�todo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo m�todo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}
		
		
		
		
		// ENTRENAMIENTO
		System.out.println("Entrenamiento: Todos los integrantes tienen su funci�n en un entrenamiento (Especializaci�n)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenamiento();
		}

		// PARTIDO DE FUTBOL
		System.out.println("Partido de F�tbol: Todos los integrantes tienen su funci�n en un partido (Especializaci�n)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.partidoFutbol();
		}


	}

}
