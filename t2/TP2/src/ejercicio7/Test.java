package ejercicio7;

public class Test {

    public static void main(String[] args) {
        // Primera Computadora y Persona
        Procesador procesador1 = new Procesador("Intel", "i9", 70);
        LectoraDVD lectoraDVD1 = new LectoraDVD("LG", true);
        Computadora computadora1 = new Computadora("Dell", "Laptop", procesador1, lectoraDVD1);
        Persona persona1 = new Persona("Francisco", "Sanchez", 12345678, computadora1);
        
        // Probar métodos de Persona
        persona1.trabajar();
        persona1.descansar();
        
        // Probar métodos de Computadora
        persona1.getComputadora().encender();
        persona1.getComputadora().apagar();
        persona1.getComputadora().reiniciar();
        
        // Cambiar la temperatura del procesador para ver la alerta
        persona1.getComputadora().getProcesador().setNivelTemperatura(95); // Esto debería imprimir "¡Temperatura crítica alcanzada!"
        
        System.out.println("------------------ TEST 2 ------------------------");
        
        // Segunda Computadora y Persona
        Procesador procesador2 = new Procesador("Intel", "i5", 95); // Esto debería imprimir "¡Temperatura crítica alcanzada!"
        LectoraDVD lectoraDVD2 = new LectoraDVD("LG", false);
        Computadora computadora2 = new Computadora("Dell", "Laptop", procesador2, lectoraDVD2);
        Persona persona2 = new Persona("Federico", "Gonzalez", 87654321, computadora2);
        
        // Probar métodos de Persona
        persona2.trabajar();
        persona2.descansar();
        
        // Probar métodos de Computadora
        persona2.getComputadora().encender();
        persona2.getComputadora().apagar();
        persona2.getComputadora().reiniciar();
        
        // Probar getters y setters
        System.out.println("Marca de la computadora 1: " + persona1.getComputadora().getMarca());
        persona1.getComputadora().setMarca("HP");
        System.out.println("Nueva marca de la computadora 1: " + persona1.getComputadora().getMarca());

        System.out.println("Tipo de computadora 2: " + persona2.getComputadora().getTipo());
        persona2.getComputadora().setTipo("Desktop");
        System.out.println("Nuevo tipo de computadora 2: " + persona2.getComputadora().getTipo());
        
        // Probar lectora de DVD
        System.out.println("¿Lectora de DVD 1 puede grabar? " + persona1.getComputadora().getLectoraDVD().getGrabar());
        System.out.println("¿Lectora de DVD 2 puede grabar? " + persona2.getComputadora().getLectoraDVD().getGrabar());
        
        // Probar cambios de temperatura
        persona2.getComputadora().getProcesador().setNivelTemperatura(85); // No debería imprimir alerta
        persona2.getComputadora().getProcesador().setNivelTemperatura(90); // Esto debería imprimir "¡Temperatura crítica alcanzada!"
    }
}
