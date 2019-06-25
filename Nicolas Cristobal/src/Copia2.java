import java.util.ArrayList;

public class Copia2 {
	private ArrayList<Persona>persona;
	
	public Copia2(){
		persona=new ArrayList<Persona>();
	}
	public void agregarPersona(Persona p) {
		persona.add(p);
	}
	public void ListarPersona() {
		for(Persona p:persona)
			System.out.println(p.imprimirPersona());
	}
	
}
