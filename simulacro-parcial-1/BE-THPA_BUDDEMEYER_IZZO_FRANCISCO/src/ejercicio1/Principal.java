package ejercicio1;
import java.util.Scanner;

public class Principal {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		final char SI = 'S', NO = 'N', VOTOBLANCO = 'B', FINALIZAR = 'F';
		
		int edad = 0;
		int totalEdades = 0;
		char voto = 'a';
		int votosPositivos = 0;
		int votosNegativos = 0;
		int votosNeutros = 0;
		int votosTotales = 0;
		
		do {
			System.out.println("Desea que se poden los arboles? ingrese 'S','N','B'(si votan en blanco),'F' (para finalizar el proceso)");
			voto = Character.toUpperCase(input.nextLine().charAt(0));
			
			if(voto != FINALIZAR && ( voto == SI || voto == NO || voto == VOTOBLANCO )) {
				System.out.println("Ingrese su edad?");
				edad = Integer.parseInt(input.nextLine());
				if(edad >= 18) {
					totalEdades += edad;
					if( voto == SI ) {
						votosPositivos++;			
					}else if( voto == NO ) {
						votosNegativos++;			
					} else if ( voto == VOTOBLANCO) {
						votosNeutros++;				
					}
				}			
			}
				
		} while ( voto != FINALIZAR );
		
		votosTotales = ( votosPositivos + votosNegativos + votosNeutros );
		
		if(votosNeutros > votosPositivos && votosNeutros > votosNegativos ) {
			System.out.println( "Indeterminado" );
		}else if (votosPositivos > votosNegativos && votosPositivos > votosNeutros) {
			System.out.println("Voto a favor");			
		}
		else {
			System.out.println("Voto en contra");			
		}
		System.out.println("Porcentaje que no desea que haya podas: " + Math.round(((double)votosNegativos / votosTotales) * 100) + "%");
		System.out.println("La edad promedio de los votantes es de: " + ( totalEdades / votosTotales ) );
		
		
		input.close();
	}

}
