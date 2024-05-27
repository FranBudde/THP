package ejercicio4;

public class Test {

	public static void main(String[] args) {
		Persona persona = new Persona();
		Persona persona2 = new Persona();
		
		persona.ponerNombre("Fulano");
		persona.ponerApellido("Gomez");
		System.out.println(persona.obtenerNombreCompleto());
		
		persona2.ponerNombre("Franco");
		persona2.ponerApellido("González");
		System.out.println(persona2.obtenerNombreCompleto());
	}

}
