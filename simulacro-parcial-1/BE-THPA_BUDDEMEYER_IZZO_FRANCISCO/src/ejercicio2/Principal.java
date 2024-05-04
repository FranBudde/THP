package ejercicio2;

public class Principal {

    public static void main(String[] args) {
        double n = 0.02;
         
        while(true){
            double decimalPart = n - Math.floor(n); // Obtiene la parte decimal de n
            System.out.println("2 * " + decimalPart + " = " + n);
            if (n == 1) {
                break;
            }
            n = decimalPart * 2; // Multiplica la parte decimal por 2
        }
    }
}
