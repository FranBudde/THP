package ejercicio4;

public class Persona {
	private String nombre;
	private String apellido;
	
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
	
	// METODOS - FIN
}



