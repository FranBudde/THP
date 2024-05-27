package ejercicio6;

public class Test {

	public static void main(String[] args) {
		final int TOTAL_CARAS = 6;
		final int NUM_LANZAMIENTOS = 100;
		
		int sumaResultados = 0;
		double promedio;
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
			
		for (int i = 1; i <= NUM_LANZAMIENTOS; i++) {
			dado1.setCara((int)(Math.random() * TOTAL_CARAS) + 1);
			dado2.setCara((int)(Math.random() * TOTAL_CARAS) + 1);
			
			sumaResultados = dado1.getCara() + dado2.getCara();
			
			System.out.println(dado1.getCara());
			System.out.println(dado2.getCara());
		}
		
		promedio = (double) sumaResultados / NUM_LANZAMIENTOS ;
		
		System.out.println("El promedio de los resultados de " + NUM_LANZAMIENTOS + " lanzamientos es: " + promedio);
	}

}
