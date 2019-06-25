package Rectangulo;

public class Rectangulo {

	private int ancho;
	private int largo;
	
	
	public float calculateArea(){
		float area=(ancho*largo);
		return area;
	}
	public float calculatePerimeter() {
		float perimetro=2*(ancho+largo);
		return perimetro;
	}
	
	public String imprmirAnchoLargo() {
		return "Ancho= " + ancho + ", Largo= " + largo ;
	}
	
	public Rectangulo(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
}
