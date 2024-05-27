package ejercicio2;

public class Persona {
	private String nombre;
	private String apellido;

	public void ponerNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Nombre: " + this.nombre);
	}

	public void ponerApellido(String apellido) {
		this.apellido = apellido;
		System.out.println("Apellido: " + this.apellido);
	}
}
