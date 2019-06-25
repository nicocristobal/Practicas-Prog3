import java.util.ArrayList;

public class Jugadores extends Persona {
	private String posicion	;
	private String nickname;
	private int cantDeVictorias;
		
	@Override
	public String toString() {
		return "Jugadores [nickname=" + nickname + ", cantDeVictorias=" + cantDeVictorias + ", posicion=" + posicion
				+ "]"+super.imprimirPersona();
	}
	
	public Jugadores(String nombre, String apellido, int edad, String localidad, ArrayList<String> registrodePeronas,
			String nickname, int cantDeVictorias, String posicion) {
		super(nombre, apellido, edad, localidad, registrodePeronas);
		this.nickname = nickname;
		this.cantDeVictorias = cantDeVictorias;
		this.posicion = posicion;
	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getCantDeVictorias() {
		return cantDeVictorias;
	}
	public void setCantDeVictorias(int cantDeVictorias) {
		this.cantDeVictorias = cantDeVictorias;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
	
	
	
}
