package ejercicio17;

import java.util.Scanner;

public class Principal {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int EDAD_MINIMA = 1;
		final int EDAD_MAXIMA = 121;
		final int EDAD_JUBILACION_M = 65;
		final int EDAD_JUBILACION_F = 60;
		final char GENERO_MUJER = 'F';
		final char GENERO_MASCULINO = 'M';
		
		char genero;
		int edad;

		System.out.print("Ingresa tu edad: ");
		edad = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa tu genero F/M: ");
		char generoChar = input.next().charAt(0);
		genero = Character.toUpperCase(generoChar);

		if ((edad < EDAD_MINIMA || edad > EDAD_MAXIMA) && (genero != GENERO_MUJER || genero != GENERO_MASCULINO)) {
			System.out.print("edad fuera de rango o género inválido");
		} else if (genero == GENERO_MUJER && edad >= EDAD_JUBILACION_F
				|| genero == GENERO_MASCULINO && edad >= EDAD_JUBILACION_M) {
			System.out.print("Estas en la edad de jubilarte");
		} else {
			System.out.print("Aún no estás en la edad de jubilarte");
		}

	}

}
