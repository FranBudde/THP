package ejercicio7;

public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private Computadora computadora;
	
	// Constructor 
	
	public Persona (String nombre , String apellido , int dni , Computadora computadora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.computadora = computadora;
	}
	
	// Getters y Setters
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido () {
		return this.apellido;
	}
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
	//Metodos
    
	public void trabajar() {
        System.out.println(nombre + " " + apellido + " está trabajando.");
    }
	
    public void descansar() {
        System.out.println(nombre + " " + apellido + " está descansando.");
    }
}
