
public class Acumulador {
	private double number;
	
	public Acumulador () {
		this.number = 0.0;
	}
	
	public void incrementar (double n) {
		this.number += n;
	}
	
	public double obtenerValor () {
		return this.number;
	}
}
