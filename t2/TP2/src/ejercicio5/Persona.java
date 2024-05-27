package ejercicio5;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	
	// CONSTRUCTORES - INICIO
	
	public Persona () { //Constructor por defecto (no recibe argumentos)
		this.nombre = "";
		this.apellido = "";
	};
	
	// CONSTRUCTORES - FIN
	
	// METODOS - INICIO
	
	public void ponerNombre(String nombre) { // Setter
		this.nombre = nombre;
	}

	public void ponerApellido(String apellido) { // Setter
		this.apellido = apellido;
	}
	
	public String obtenerNombreCompleto () { //Getter
		return this.nombre + " " + this.apellido;
	}
	
	public void setDomicilio (Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public Domicilio getDomicilioPersona () {
		return this.domicilio;
	}
	
	public String getDomicilioCompleto() {
		String mensaje = "La persona no tiene domicilio";
				
		if(this.domicilio.getCalle() != "" && this.domicilio.getNumero() != 0 && this.domicilio.getCiudad() != "") {
			mensaje = this.domicilio.getCalle() + " " + this.domicilio.getNumero() + " " + this.domicilio.getCiudad();
		}
		
		return mensaje;
	}
	
	// METODOS - FIN
}
