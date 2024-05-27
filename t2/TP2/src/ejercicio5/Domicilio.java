package ejercicio5;

public class Domicilio {
	private String calle;
	private int numero;
	private String ciudad;
	
	
	// Constructor por defecto
	public Domicilio () {
		this.calle = "";
		this.numero = 0;
		this.ciudad = "";
	}
	
	// Metodos
	
	// CALLE
	public void setCalle (String calle) {
		this.calle = calle;
	}
	
	public String getCalle () {
		return this.calle;
	}
	
	// NUMERO
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public int getNumero () {
		return this.numero;
	}
	
	// CIUDAD
	
	public void setCiudad (String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getCiudad () {
		return this.ciudad;
	}
	
}
