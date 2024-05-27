package ejercicio3;

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
		System.out.println("Nombre: " + this.nombre);
	}

	public void ponerApellido(String apellido) { // Setter
		this.apellido = apellido;
		System.out.println("Apellido: " + this.apellido);
	}
	
	public String obtenerNombreCompleto () { //Getter
		return this.nombre + " " + this.apellido;
	}
	
	// METODOS - FIN
}
