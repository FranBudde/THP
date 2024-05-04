package ejercicio1;

import java.util.Scanner;

public class Principal {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int INTENTOS_PRUEBA = 4;
		final double TERMOTANQUE_NO_APTO = 0.25;
		final double TERMOTANQUE_APTO = 0.10;
		final int MIN_CAPACIDAD_CALORICA = 1;
		final int MIN_PERDIDA_CALORICA = 0;
		final String CONDICION_SALIDA = "";
		
		String codigoIdentificacion;
		int capacidadCalorica, perdidaCalorica;
		double deficienciaTermica;
		double menorDeficiencia = Double.MAX_VALUE;
		String termotanqueMasEficaz = "";
		boolean banderaNoApto = false;
		boolean banderaApto = false;

		do {
			System.out.println("Ingrese el codigo de identificación del termotanque: ");
			codigoIdentificacion = input.nextLine();

			if (!codigoIdentificacion.equals(CONDICION_SALIDA)) {
				do {

					System.out.println("Ingrese la capacidad calórica del termotanque:(un número entero positivo mayor a 0) ");
					capacidadCalorica = Integer.parseInt(input.nextLine());

				} while (capacidadCalorica < MIN_CAPACIDAD_CALORICA);

				for (int i = 1; ((i <= INTENTOS_PRUEBA) && (!banderaNoApto)); i++) {
					do {

						System.out.println(
								"Ingrese la pérdida calórica del termotanque: (un número entero con valor cero o mayor)");
						perdidaCalorica = Integer.parseInt(input.nextLine());

					} while (perdidaCalorica < MIN_PERDIDA_CALORICA);

					deficienciaTermica = ((double) perdidaCalorica) / capacidadCalorica;


					if (deficienciaTermica > TERMOTANQUE_NO_APTO) {
						banderaNoApto = true;
					} else if (deficienciaTermica < TERMOTANQUE_APTO) {
						banderaApto = true;

						if (deficienciaTermica < menorDeficiencia) {
							menorDeficiencia = deficienciaTermica;
							termotanqueMasEficaz = codigoIdentificacion;
						}

					}
				}
				if (banderaNoApto) {
					System.out.println("PÉRDIDA EXCESIVA DE CALORÍAS");
				} else if (banderaApto) {
					System.out.println("TERMOTANQUE APTO");
				} else {
					System.out.println("AISLACIÓN INSUFICIENTE");
				}

				banderaNoApto = false;
				banderaApto = false;
			}

		} while (!codigoIdentificacion.equals(CONDICION_SALIDA));
		
		if(!termotanqueMasEficaz.equals(CONDICION_SALIDA)) {
			System.out.println("Termotante con menor deficiencia termica: " + termotanqueMasEficaz + " cuya deficiencia termica es de: " + menorDeficiencia);
		}

		input.close();
	}

}
