package ejercicio8;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	//Setters y Getters
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
	}


	public String getNumero() {
		return numero;
	}


	private void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	private void setTitular(String titular) {
		this.titular = titular;
	}


	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}


	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}


	public double getAcumuladoActual() {
		return acumuladoActual;
	}
	
	// Metodos
	
	public double montoDisponible () {
		double disponible = ( limiteDeCompra - acumuladoActual );
		return disponible < 0 ? 0 : disponible;
	}
	
	private Boolean compraPosible (double monto) {
		
		return monto <= montoDisponible();
	}
	
	public void actualizarLimite (double limiteDeCompra) {
		
		setLimiteDeCompra(limiteDeCompra);
	}
	
	private void acumularGastoActual (double importeCompra) {
		this.acumuladoActual += importeCompra;
	}
	
	public Boolean realizarCompra (double monto) {
		Boolean comprar = false;
		if (compraPosible(monto)) {
			acumularGastoActual(monto);
			comprar = true;
		}
		return comprar;
	}
	
	// Método toString
	 @Override
	public String toString() {
        return "Tarjeta de Crédito [" +
                "Número: '" + numero + '\'' +
                ", Titular: '" + titular + '\'' +
                ", Límite de Compra: $" + limiteDeCompra +
                ", Acumulado Actual: $" + acumuladoActual +
                ", Monto Disponible: $" + montoDisponible() +
                ']';
    }
	
}
