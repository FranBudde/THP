package ejercicio5;

public class Test {

	public static void main(String[] args) {
		Persona persona = new Persona();
		Domicilio domicilio = new Domicilio();
		
		Persona persona2 = new Persona();
		Domicilio domicilio2 = new Domicilio();
		
		persona.ponerNombre("Fulano");
		persona.ponerApellido("Gomez");
		domicilio.setCalle("9 de julio");
		domicilio.setNumero(324);
		domicilio.setCiudad("Lanus");
		persona.setDomicilio(domicilio);
		System.out.println(persona.obtenerNombreCompleto());
		System.out.println(persona.getDomicilioCompleto());
		
		System.out.println("--------------------------------");
		
		persona2.ponerNombre("Franco");
		persona2.ponerApellido("González");
		domicilio2.setCalle("20 de julio");
		domicilio2.setNumero(326);
		domicilio2.setCiudad("Lomas");
		persona2.setDomicilio(domicilio2);
		System.out.println(persona2.obtenerNombreCompleto());
		System.out.println(persona2.getDomicilioCompleto());

	}

}
