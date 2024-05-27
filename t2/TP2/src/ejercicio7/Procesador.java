package ejercicio7;

public class Procesador {
    private String marca;
    private String modelo;
    private int nivelTemperatura;
    //Le puse static para asegurar que solo haya una copia de este atributo en memoria, independiente
    //de cuantas instancas de 'Procesador' se creen
    private static final int NIVEL_TEMPERATURA_CRITICA = 90;


    public Procesador(String marca, String modelo, int nivelTemperatura) {
        this.marca = marca;
        this.modelo = modelo;
        this.nivelTemperatura = nivelTemperatura;
        verificarTemperaturaCritica();
    }

    // Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNivelTemperatura() {
        return nivelTemperatura;
    }

    public void setNivelTemperatura(int nivelTemperatura) {
        this.nivelTemperatura = nivelTemperatura;
        verificarTemperaturaCritica();
    }

    private void verificarTemperaturaCritica() {
        if (this.nivelTemperatura >= NIVEL_TEMPERATURA_CRITICA) {
            notificarTemperaturaCritica();
        }
    }

    private void notificarTemperaturaCritica() {
        System.out.println("¡Temperatura crítica alcanzada! " + this.nivelTemperatura + "%");
    }
}
