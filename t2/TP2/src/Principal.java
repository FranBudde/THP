import java.util.Scanner;

public class Principal {
	final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		final int VALOR_MIN = 0;
		final int VALOR_MAX = 10;
		final int STOP = -1;
		
		double nota;
		Promedio promedio = new Promedio();
		
		do {
			System.out.println("Ingresa una nota entre " + VALOR_MIN + " y " + VALOR_MAX);
			nota = Integer.parseInt(input.nextLine());
			
			if ( nota >= VALOR_MIN && nota <= VALOR_MAX ) {
				promedio.incrementar(nota);
			} else {
				System.out.println("Nota fuera de rango, por favor ingrese una nota entre " + VALOR_MIN + " y " + VALOR_MAX);
			}
			
		} while ( nota != STOP );
		
		System.out.println("Nota promedio: " + promedio.obtenerValor());
		
		
		
		input.close();
	}

}
