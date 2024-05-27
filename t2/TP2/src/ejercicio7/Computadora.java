package ejercicio7;

public class Computadora {
	private String marca;
	private String tipo;
	private Procesador procesador;
	private LectoraDVD lectoraDVD;
	
	public Computadora(String marca, String tipo, Procesador procesador, LectoraDVD lectoraDVD) {
		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
		this.lectoraDVD = lectoraDVD;
	}
	
	// Getters y Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public LectoraDVD getLectoraDVD() {
		return lectoraDVD;
	}
	public void setLectoraDVD(LectoraDVD lectoraDVD) {
		this.lectoraDVD = lectoraDVD;
	}
	
	// Metodos
	
	public void encender () {
		System.out.println("Encender pc");
	}
	
	public void apagar () {
		System.out.println("Apagar pc");
	}
	
	public void reiniciar () {
		System.out.println("Reiniciar pc");
	}
	
		
}
