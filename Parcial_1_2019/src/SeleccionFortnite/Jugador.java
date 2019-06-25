package SeleccionFortnite;

public class Jugador extends Persona{
	
	private int cantidadDeVictorias;
	private String nickname;
	private String posicion;
	

	@Override
	public boolean equals(Object obj) {
		if(obj!=null){
			if(obj instanceof Jugador) {
				Jugador jugador=(Jugador)obj;
				if(jugador.getNickname().equals(getNickname()))
					return true;
				else
					return false;	
			}
			else
				return false;
		}
		else
			return false;
	}

	public String participo() {
		return "Estoy tirando tiros";
	}
	
	@Override
	public String toString() {
		return "Jugador [cantidadDeVictorias=" + getCantidadDeVictorias() + ", nickname=" + getNickname() + ", posicion="
				+ getPosicion() + "]"+super.toString();
	}

	@Override
	public String estoyViajando() {
		return super.estoyViajando();
	}
	
	@Override
	public String estoyConcentracion() {
		return super.estoyConcentracion();
	}

	// Contructor Vacio
	public Jugador() {
		super();
		cantidadDeVictorias = 0;
		nickname = "";
		posicion = "";
	}
	public Jugador(String nombre, String apellido, String edad, String localidad, int cantidadDeVictorias,
			String nickname, String posicion) {
		super(nombre, apellido, edad, localidad);
		this.cantidadDeVictorias = cantidadDeVictorias;
		this.nickname = nickname;
		this.posicion = posicion;
	}
	public Jugador(int cantidadDeVictorias, String nickname, String posicion) {
		super();
		this.cantidadDeVictorias = cantidadDeVictorias;
		this.nickname = nickname;
		this.posicion = posicion;
	}
	public int getCantidadDeVictorias() {
		return cantidadDeVictorias;
	}
	public void setCantidadDeVictorias(int cantidadDeVictorias) {
		this.cantidadDeVictorias = cantidadDeVictorias;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	

}
