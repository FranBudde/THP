package ejercicio1;

public class Ejercicio1 {

	public double sumar(double n1, double n2) {
		return n1 + n2;
	}

	public double pedirNumero(String texto, double min, double max) {
		double numEntre = 0;

		if (min < max) {
			numEntre = min + (max - min) * Math.random();
			System.out.println(texto + numEntre);
		} else {
			System.out.println("El numero minimo tiene que ser menor al numero maximo");
		}
		return numEntre;
	}
}
