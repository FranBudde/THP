
public class Promedio {
	private Acumulador acumulador;
	private Contador contador;
	
	public Promedio () {
		acumulador = new Acumulador();
		contador = new Contador();
	}
	
	public void incrementar (double n) {
		this.acumulador.incrementar(n);
		this.contador.incrementar();
	}
	
	public double obtenerValor () {
		return this.contador.obtenerValor() == 0 ? 0.0 : (this.acumulador.obtenerValor() / this.contador.obtenerValor());
	}
}
