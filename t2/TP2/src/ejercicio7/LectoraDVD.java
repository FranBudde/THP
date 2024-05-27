package ejercicio7;

public class LectoraDVD {
	private String marca;
	private Boolean grabar;
	
	public LectoraDVD(String marca, Boolean grabar) {
		this.marca = marca;
		this.grabar = grabar;
	}
	// Getters y Setters
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Boolean getGrabar() {
		return grabar;
	}
	public void setGrabar(Boolean grabar) {
		this.grabar = grabar;
	}
		
}
