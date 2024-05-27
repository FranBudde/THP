package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Persona persona;
		
		persona = new Persona();
		persona.ponerNombre("Francisco");
		persona.ponerApellido("Izzo");

		System.out.println(persona.obtenerNombreCompleto());
	}

}
