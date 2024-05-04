package edu.ort.t1.tp1;

import java.util.Iterator;
import java.util.Scanner;
import java.text.DecimalFormat;
import edu.ort.t1.tp1.PersonasAporte;
import edu.ort.t1.tp1.Monta�arusaPersonas;

public class Activididades {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
//		actividad_1 ();
	
//		actividad_2 ();
	
//		actividad_3 ();
	
//		actividad_4 ();
	
//		actividad_5 ();		
		
//		actividad_6 ();	
		
//		actividad_7 ();
		
//		actividad_7 ();
		
//		actividad_8 ();
		
//		actividad_9 ();
		
//		actividad_10 ();
		
//		actividad_11 ();
		
//		actividad_12 ();
		
//		actividad_14 ();
		
//		actividad_15 ();
		
//		actividad_16 ();
		
//		actividad_17 ();
		
//		actividad_18 ();
		
//		actividad_19 ();
		
//		actividad_20 ();
		
//		actividad_21 ();
		
//		actividad_22 ();
		
//		actividad_23 ();
		
//		actividad_24 ();
		
//		actividad_25 ();
		
//		actividad_26 ();
		
//		actividad_27 ();
		
//		actividad_28 ();
		
//		actividad_29 ();
		
//		actividad_30 ();
		
//		actividad_31 ();
		
//		actividad_32 ();
		
//		actividad_33 ();
		
//		actividad_34 ();
		
//		actividad_35 ();
		
//		actividad_36 ();
		
//		actividad_37 ();
		
//		actividad_38 ();
		
		actividad_39 ();

}
	public static void actividad_1 (){
		String name;

		do{
			System.out.println("Ingresa tu nombre");
			name = input.nextLine();
			if(name.length() < 3){
			System.out.println("Tiene que tener minimo 3 caracteres");
			};
		}while (name.length() < 3);
	}
	
	public static void actividad_2 (){
	
				int notas[] = new int [3];
				float suma = 0;
				System.out.println("Ingresa tus notas: ");
				for(int i = 0; i < notas.length; i++){
					
					do{
						try{
							System.out.print("Nota " + (i+1) + ": ");
							notas[i] = Integer.parseInt(input.nextLine());
							if(notas[i] > 10 || notas[i] < 0){
								System.out.println("La nota debe estar entre 0 y 10");
								continue;
							}
							break;
						}
						catch(NumberFormatException error){
							System.err.println("Debes ingresar un n�mero ");
						}
					}while (true);
					
					suma += notas[i];
				}
				
				System.out.println("Tu promedio es de: " + suma / notas.length);
				
	}

	public static void actividad_3 () {
		System.out.print("Ingresa un numero: ");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("El numero que ingresaste es: " + number);
		System.out.println(number + " x " + 5 + " es: " + (number*5));
		System.out.println(number + " / " + 2 + " es: " + (number/2));
	}

	public static void actividad_4 () {

		System.out.print("Ingresa tu valor monetario por hora: ");
		int valorMonetario = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa tus horas trabajadas: ");
		int horasTrabajadas = Integer.parseInt(input.nextLine());
		int valorPorSemana = ( ( horasTrabajadas * 5 ) + (horasTrabajadas/2) ) * valorMonetario ;
		System.out.print("valor del salario por semana: " + valorPorSemana );
		
	}

	public static void actividad_5 () {

		System.out.print("El valor que ingresaste en num1 es: ");
		float num1 = Float.parseFloat(input.nextLine());
		System.out.print("El valor que ingresaste en num2 es: ");
		float num2 = Float.parseFloat(input.nextLine());
		float num3;
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.print("El valor que tenes en la variable num1 es: " + num1 + " y en num2 es: " + num2);
	}

	public static void actividad_6 () {

		
		System.out.print("ingresa tus ventas totales de este mes: ");
		int ventasTotalesMes = Integer.parseInt(input.nextLine());
		int sueldoFijo = 44_000;
		float totalAcobrar = sueldoFijo + ( ventasTotalesMes * 1.16f );
		
		DecimalFormat formato = new DecimalFormat("#,###.##");		
		String totalAcobrarFormateado = formato.format(totalAcobrar);
		
		System.out.print("Tu sueldo este mes es de: $" + totalAcobrarFormateado);
	}
	
	public static void actividad_7 () {
		    
		System.out.print("ingresa el ancho del terreno: ");
		float ancho = Float.parseFloat(input.nextLine());
		System.out.print("ingresa el largo del terreno: ");
		float largo = Float.parseFloat(input.nextLine());
		System.out.print("ingresa el valor del metro cuadrado: ");
		float valorMetroCuadrado = Float.parseFloat(input.nextLine());
		float areaDelTerro = ancho * largo;
		float valorDelTerreno = areaDelTerro * valorMetroCuadrado;		
		float metrosCerca = ( ancho * 2 ) + ( largo * 2 );

		String areaDelTerrenoFormateado = String.format("%,.2f", valorDelTerreno);
		
		System.out.println("El valor total del terreno es: $" + areaDelTerrenoFormateado);
		System.out.println("La cantidad de metros de cerca que se necesita son: " + metrosCerca + 'm');
		
	}
	
	public static void actividad_8 () {
		System.out.print("Ingresa el primer numero natural: ");
		float num1 = Float.parseFloat(input.nextLine());
		System.out.print("Ingresa el segundo numero natural: ");
		float num2 = Float.parseFloat(input.nextLine());
		
		if(num1 < 0  || num2 < 0) {
			System.out.print("Solo podes ingresar numeros naturales");
			return;
		}
		
		System.out.print("Ingresa uno de los siguientes operadores: +, -, / o * ");
		char operador = input.next().charAt(0);
		
		switch (operador) {
		case '+':
			System.out.print("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
			break;
		case '-':
			System.out.print("La resta de " + num1 + " y " + num2 + " es: " + (float) (num1 - num2));
			break;
		case '/':
			System.out.print("La division de " + num1 + " y " + num2 + " es: " + (float) (num1 / num2));
			break;
		case '*':
			System.out.print("La multiplicacion de " + num1 + " y " + num2 + " es: " + (float) (num1 * num2));
			break;
		default:
		System.out.print("El operador que ingreso es incorrecto");
			break;
		}
		
	}
	
	public static void actividad_9 () {
		System.out.print("Ingresa el primer angulo por favor: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa el segundo angulo por favor: ");
		int num2 = Integer.parseInt(input.nextLine());
		int tercerAngulo = 180 - ( num1 + num2 ); 
		
		System.out.print("El tercer angulo interior es: " + tercerAngulo + "�");
	}

	public static void actividad_10 () {
		PersonasAporte donadores[] = new PersonasAporte[3];
		String name;
		float aporte;
		float totalAporte = 0;
		for (int i = 0; i < donadores.length; i++) {
			System.out.print("Ingresa el nombre de la persona " + ( i + 1 ) + ": " );
			name = input.nextLine();
			System.out.print("Ingresa el aporte de la persona " + ( i + 1 ) + ": " );
			aporte = Float.parseFloat(input.nextLine());
			donadores[i] = new PersonasAporte(name, aporte);
			totalAporte += donadores[i].getAporte();
		}
		
		System.out.println();	
		
		for (int i = 0; i < donadores.length; i++) {
			System.out.print("donador: " + donadores[i].getNombre());
			System.out.println(" aporte: " + donadores[i].getAporte());
			System.out.println("porcentaje aportado: " + ( donadores[i].getAporte() * 100) / totalAporte);	
			System.out.println();	
		}
		System.out.println("El aporte total de los 3 donadores es de: $" + totalAporte);
	}

	public static void actividad_11 () {
		System.out.print("Ingresa un numero: ");
		int number = Integer.parseInt(input.nextLine());
		
		if (( number % 2 ) != 0){
			System.out.print("El numero que ingresaste " + number + " no es par");
			return;
		}
		System.out.print("El numero que ingresaste " + number + " es par ");
	}
	
	public static void actividad_12 () {
		System.out.print("Ingresa el primer numero: ");
		int number1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa el segundo numero: ");
		int number2 = Integer.parseInt(input.nextLine());
		
		if (number1 > number2){
			System.out.print("El primer numero que ingresaste " + number1 + " es mayor a " + number2);
			return;
		}
		System.out.print("El segundo numero que ingresaste " + number2 + " es mayor a " + number1);
		
	}
	
	public static void actividad_13 () {
		int numbers[] = new int [3];
		double negInf = Double.NEGATIVE_INFINITY;
				
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Ingresa el el numero " + ( i + 1 ) + ": ");
			numbers[i] = Integer.parseInt(input.nextLine());
			
			if(numbers[i] > negInf){
				negInf = numbers[i];
			}
		}
		System.out.println("Los numeros que ingresaste son: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("El numero mas grande es: " + negInf);
	}
	
	public static void actividad_14 () {
		Monta�arusaPersonas ingresantes[] = new Monta�arusaPersonas[4];
		
		String name;
		float altura;
		int edad;
		
		float alturaMinima = 1.50f;
		int edadMinima = 7;
		
		for (int i = 0; i < ingresantes.length; i++) {
			System.out.print("Ingresa el nombre de la persona " + ( i + 1 ) + ": " );
			name = input.nextLine();
			
			System.out.print("Ingresa la altura de la persona " + ( i + 1 ) + ": " );
			altura = Float.parseFloat(input.nextLine());
			
			System.out.print("Ingresa la edad de la persona " + ( i + 1 ) + ": " );
			edad = Integer.parseInt(input.nextLine());
			
			ingresantes[i] = new Monta�arusaPersonas(name, altura, edad);
			System.out.print("");
		}
		
		System.out.print("");
		
		for (int i = 0; i < ingresantes.length; i++) {
			if(ingresantes[i].getEdad() >= edadMinima && ingresantes[i].getAltura() >= alturaMinima){
				System.out.println("El ingresante " + ingresantes[i].getNombre() + " puede pasar ya que tiene una altura de " + ingresantes[i].getAltura() + " y tiene " + ingresantes[i].getEdad() + " a�os");
			}
		}
		
	}

	public static void actividad_15 () {
Monta�arusaPersonas ingresantes[] = new Monta�arusaPersonas[4];
		
		String name;
		float altura;
		int edad;
		
		float alturaMinima = 1.51f;
		int edadMinima = 7;
		
		for (int i = 0; i < ingresantes.length; i++) {
			System.out.print("Ingresa el nombre de la persona " + ( i + 1 ) + ": " );
			name = input.nextLine();
			
			System.out.print("Ingresa la altura de la persona " + ( i + 1 ) + ": " );
			altura = Float.parseFloat(input.nextLine());
			
			System.out.print("Ingresa la edad de la persona " + ( i + 1 ) + ": " );
			edad = Integer.parseInt(input.nextLine());
			
			ingresantes[i] = new Monta�arusaPersonas(name, altura, edad);
			System.out.print("");
		}
		
		System.out.print("");
		
		for (int i = 0; i < ingresantes.length; i++) {
			if(ingresantes[i].getEdad() >= edadMinima || ingresantes[i].getAltura() >= alturaMinima){
				System.out.println("El ingresante " + ingresantes[i].getNombre() + " puede pasar ya que tiene una altura de " + ingresantes[i].getAltura() + " y tiene " + ingresantes[i].getEdad() + " a�os");
			}
		}
	}

	public static void actividad_16 () {
		System.out.print("Ingresar la cantidad de inscriptos: ");
		int inscriptos = Integer.parseInt(input.nextLine());
		System.out.print("Ingresar la cantidad de asientos: ");
		int asientos = Integer.parseInt(input.nextLine());
		
		System.out.print("");
		
		if(inscriptos > asientos){
			System.out.println("No alcazan los asientos, hay " + asientos + " asientos y son " + inscriptos + " personas");
			System.out.println("La cantidad de asientos que faltan para que entren todos es de: " + ( inscriptos - asientos ));
			return;
		}
		
		System.out.print("Entraron todos");
		
	}

	public static void actividad_17 () {
		final int EDAD_MINIMA = 1;
		final int EDAD_MAXIMA = 121;
		final int EDAD_JUBILACION_M = 65;
		final int EDAD_JUBILACION_F = 60;
		final char GENERO_MUJER = 'F';
		final char GENERO_MASCULINO ='M';
		
		int edad;
		
		System.out.print("Ingresa tu edad: ");
		edad = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa tu genero F/M: ");
		char generoChar = input.next().charAt(0);
		char genero = Character.toUpperCase(generoChar);
			
		if(( edad < EDAD_MINIMA || edad > EDAD_MAXIMA ) && ( genero != GENERO_MUJER || genero != GENERO_MASCULINO )){
			System.out.print("edad fuera de rango o g�nero inv�lido");
		} else if (genero == GENERO_MUJER && edad >= EDAD_JUBILACION_F || genero == GENERO_MASCULINO && edad >= EDAD_JUBILACION_M) {
			System.out.print("Estas en la edad de jubilarte");
		} else {
			System.out.print("A�n no est�s en la edad de jubilarte");
		}
		
	}	

	public static void actividad_18 () {
		System.out.print("Ingresa el primer numero: ");
		int number_1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa el segundo numero: ");
		int number_2 = Integer.parseInt(input.nextLine());
		int mayor = Math.max(number_1, number_2);
		int menor = Math.min(number_1, number_2);
		
		String mensaje = (mayor  % menor == 0) ?"Es divisible" : "No es divisible";
		System.out.print(mensaje);
	}

	public static void actividad_19 () {
		int number_1 = (int)(Math.random()*10+1);
		System.out.print("El numero que tenes es: " + number_1);
		boolean esDeUnSoloDigito = number_1 >= 0 && number_1 < 10;
		boolean esImpar = number_1 % 2 != 0;
		boolean estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		boolean noEstaEnNingunGrupo = !estaEnAmbosGrupos;
		
		System.out.println("");
		
		if(esDeUnSoloDigito){
			System.out.println("Es de un solo digito " + number_1);
		}
		
		if(esImpar){
			System.out.println("Es impar " + number_1);
		}
		
		if(estaEnAmbosGrupos){
			System.out.println("Esta en ambos grupos es de un solo digito y es impar " + number_1);
			return;
		}
		if(noEstaEnNingunGrupo) {
			System.out.println("No esta en ningun grupo " + number_1);
			return;
		}

	}

	public static void actividad_20 () {
		char operador;
		int num1;
		int num2;
		
		do {
			System.out.print("Ingresa el primer numero entero: ");
			num1 = Integer.parseInt(input.nextLine());
			System.out.print("Ingresa el segundo numero entero: ");
			num2 = Integer.parseInt(input.nextLine());
					
			System.out.print("Ingresa uno de los siguientes operadores: +, -, / o * ");
			operador = (input.nextLine()).charAt(0);
			
			if(num2 == 0 && operador == '/') {
				System.out.println("Error ingresaste un 0 y no se puede dividir por 0 ");
			}
			
		} while (num2 == 0 && operador == '/');
		
		switch (operador) {
		case '+':
			System.out.print("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
			break;
		case '-':
			System.out.print("La resta de " + num1 + " y " + num2 + " es: " +  (num1 - num2));
			break;
		case '/':
			System.out.print("La division de " + num1 + " y " + num2 + " es: " +  (num1 / num2));
			break;
		case '*':
			System.out.print("La multiplicacion de " + num1 + " y " + num2 + " es: " +  (num1 * num2));
			break;
		default:
		System.out.print("El operador que ingreso es incorrecto");
			break;
		}	
	}

	public static void actividad_21 () {
		int number;
		
		do {
			System.out.print("Ingresa un numero entre 1 y 7: ");
			 number = Integer.parseInt(input.nextLine());
			if( number < 1 || number > 7 ) {
				System.out.println("ERROR ingresaste un numero fuera del rango que te pedimos");
			}
		} while (number < 1 || number > 7);
		
		switch (number) {
		case 1:
			System.out.println("Es domingo");
			break;
		case 2:
			System.out.println("Es lunes");
			break;
		case 3:
			System.out.println("Es martes");
			break;
		case 4:
			System.out.println("Es miercoles");
			break;
		case 5:
			System.out.println("Es jueves");
			break;
		case 6:
			System.out.println("Es viernes");
			break;

		default:
			System.out.println("Es sabado");
			break;
		}
	}

	public static void actividad_22 () {
		int numbers[] = {1,2,3,4,5}; 
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Orden de los numeros: " + numbers[i]);
		}
		
		System.out.println("");
		
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println("Orden de los numeros de forma inversa es: " + numbers[i]);
		}
	}

	public static void actividad_23 () {
		System.out.print("Ingresa un numero: ");
		int number = Integer.parseInt(input.nextLine());
		int acumulador = 1;
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("El numero que ingresaste " + number + " multiplicado por " + i + " es: " + ( number * i ));
//		}
		
		while (acumulador <= 10) {
			System.out.println("El numero que ingresaste " + number + " * " + acumulador + " es: " + ( number * acumulador ));
			acumulador++;
		}
	}

	public static void actividad_24 () {
		int num1;
		int num2;
		do {
			System.out.print("Ingresa el primer numero: ");
			num1 = Integer.parseInt(input.nextLine());
			System.out.print("Ingresa el segundo numero: ");
			num2 = Integer.parseInt(input.nextLine());
			
			if(num1 > num2) {
				System.out.println("El primer numero debe ser menor o igual al segundo numero ingresado");
			};
		} while (num1 > num2);
		
		System.out.println("los numeros que existen entre " + num1 + " y " + num2 + " excluyendolos son:");		
		
		for (int i = num1 + 1; i < num2; i++) {
			System.out.println(i);
		}
		
		System.out.println("los numeros que existen entre " + num1 + " y " + num2 + " incluyendolos son:");	
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void actividad_25 () {
		System.out.print("Ingresa el ancho: ");
		int ancho = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa el largo: ");
		int largo = Integer.parseInt(input.nextLine());
		int matriz[][] = new int [ancho] [largo];
		
        // Pedir al usuario que ingrese los valores para cada celda de la matriz
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print("Ingresa el valor para la posici�n [" + x + "][" + y + "]: ");
                matriz[x][y] = Integer.parseInt(input.nextLine());
            }
        }
        
        // Imprimir la matriz despu�s de asignar valores
        System.out.println("Matriz ingresada:");
        for (int x = 0; x < matriz.length; x++) {
        	 System.out.println("|");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
                if (y!=matriz[x].length-1) System.out.print("\t"); //mientras " y " sea distinto al ultimo indice que tiene la matriz en la fila
            }
            System.out.println("|"); // Nueva l�nea despu�s de imprimir cada fila
        }
		
	}

	public static void actividad_26 () {
		System.out.print("Ingresa un numero natural: ");
		float number = Float.parseFloat(input.nextLine());		
		int j = 1;
		
		for (int i = 1; i <= number; i++) {
			if(( j * 3 ) % 5 != 0 ) {
				System.out.println(j + " * " + 3 + " = " + ( j * 3 ));
			}else {
				i--;
			}
			j++;
		}
		
	}

	public static void actividad_27 () {
		int edades[] = new int[5];
		int acum = 0;
		int impares = 0;
		
		for (int i = 0; i < edades.length; i++) {
			System.out.print("Ingresa edad numero " + ( i + 1) + " : ");
			edades[i] = Integer.parseInt(input.nextLine());
			
			if(edades[i] % 2 != 0 && edades[i] > 18) impares++;
			acum += edades[i];
		}
		System.out.println("El promedio de todas las edades ingresadas fueron de: " +(float)( acum / edades.length ));
		System.out.println("La cantidad de edades impares mayores que 18 son: " + impares);
	}
	
	public static void actividad_28 () {
		System.out.print("Ingresa un numero: ");
		int cant = Integer.parseInt(input.nextLine());
		double mayor = Double.NEGATIVE_INFINITY;
		int indice = -1;
		
		for (int i = 1; i <= cant; i++) {
			System.out.print("Ingresa un numero: ");
			int number = Integer.parseInt(input.nextLine());
			if( number > mayor) {
				mayor = number;
				indice = i;
			}
		}
		System.out.println("El numero mayor fue: " + mayor + " en el indice: " + indice);
	}
	
	public static void actividad_29 () {
		float number;	
		
		do {
			System.out.print("Ingresa un numero entre 0 y 10: ");
			number = Float.parseFloat(input.nextLine());
		} while (number < 0 || number > 10);
		System.out.print("El numero que ingresaste es: " + number);
	}

	public static void actividad_30 () {
		char operador;
		int num1;
		int num2;
		
		do {
			System.out.print("Ingresa uno de los siguientes operadores: ( +, -, / , * o F(para finalizar) ) ");
			operador = (input.nextLine()).charAt(0);
			
			if( Character.toUpperCase(operador)  == 'F') {
				System.out.println("Se a finalizado la operacion... Vuelva pronto!!");
				return;
			}
			
			System.out.print("Ingresa el primer numero entero: ");
			num1 = Integer.parseInt(input.nextLine());
			System.out.print("Ingresa el segundo numero entero: ");
			num2 = Integer.parseInt(input.nextLine());
					

			
			if(num2 == 0 && operador == '/') {
				System.out.println("Error ingresaste un 0 y no se puede dividir por 0 ");
			}
			
		} while (num2 == 0 && operador == '/');
		
		switch (operador) {
		case '+':
			System.out.print("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
			break;
		case '-':
			System.out.print("La resta de " + num1 + " y " + num2 + " es: " +  (num1 - num2));
			break;
		case '/':
			System.out.print("La division de " + num1 + " y " + num2 + " es: " +  (num1 / num2));
			break;
		case '*':
			System.out.print("La multiplicacion de " + num1 + " y " + num2 + " es: " +  (num1 * num2));
			break;
		default:
		System.out.print("El operador que ingreso es incorrecto");
			break;
		}	
	}

	public static void actividad_31 () {
		final char SI = 'S';
		final char NO = 'N';
		
		char option;
		
		do {
			System.out.print("�Dese�s continuar? [S/N]: ");
			option = Character.toUpperCase(input.nextLine().charAt(0));
			System.out.println(option);
			
		} while (option != SI && option != NO);
		
//		System.out.print("�Dese�s continuar? [S/N]: ");
//		option = Character.toUpperCase(input.nextLine().charAt(0));
//		
//		while (option != SI && option != NO) {
//			System.out.print("�Dese�s continuar? [S/N]: ");
//			option = Character.toUpperCase(input.nextLine().charAt(0));
//		}
		
		System.out.print("Saliste del bucle");
	}

	public static void actividad_32 () {
		float number;	
		
		do {
			System.out.print("Ingresa un numero 2 o entre  4 y 10: ");
			number = Float.parseFloat(input.nextLine());
		} while (number != 2 && number < 4 || number > 10);
		System.out.print("El numero que ingresaste es: " + number);
	}

	public static void actividad_33 () {
		float number;
		float max = Float.NEGATIVE_INFINITY;
		float min = Float.POSITIVE_INFINITY;
		
		do {
			System.out.print("Ingresa un numero: ");
			number = Float.parseFloat(input.nextLine());
			
			if(number > max) {
			 max = number;
			}
			
			if(number < min) {
				min = number;
			}
			System.out.println("El numero mayor actualmente es: " + max);
			System.out.println("El numero menor actualmente es: " + min);
			System.out.println("");
		} while (number != 0);
	}

	public static void actividad_34 () {
		float altura;
		float acum = 0;
		int contador = 0;
		
		do {
			System.out.print("Ingresa tu estatura: ");
			altura = Float.parseFloat(input.nextLine());
			acum += altura;
			if ( altura != 0 ) contador++;
		} while (altura != 0);
		System.out.print("La estatura promedio es de: " + ( acum / contador ));
	}

	public static void actividad_35 () {
		String name;
		int edad;
		int edadjoven = Integer.MAX_VALUE;
		String nameJoven = "";
		
		do {
			System.out.print("Ingresa tu nombre: ");
			name = input.nextLine();
			
			if(name.charAt(0) != '*' ) {
				System.out.print("Ingresa tu edad: ");
				edad = Integer.parseInt(input.nextLine());
				
				if( edad < edadjoven) {
					edadjoven = edad;
					nameJoven = name;
				}
			}

			
		} while ( name.charAt(0) != '*' );
		System.out.print("La persona mas joves es: " + nameJoven + " y tiene " + edadjoven + " a�os");
	}

	public static void actividad_36 () {
		int numero;
		int division = 0;
		int acumulador = 0;
		
		do {
			System.out.print("Ingresa un numero: ");
			numero = Integer.parseInt(input.nextLine());
			division++;
			acumulador += numero;
			
			System.out.println("El promedio actualmente es de:  " + ( acumulador / division ) );
			System.out.println("");
		} while ( ( acumulador / division ) < 20);
		
		System.out.println("La cantidad de valores leidos son: " + division );
	}

	public static void actividad_37 () {
		int meses = 12;
		float sueldo = 0;
		float acumulador = 0;
		
		do {
			System.out.print("Ingresa tu sueldo: ");
			sueldo = Float.parseFloat(input.nextLine());
			if(sueldo < 0) break;
			acumulador += sueldo;
			meses++;
		} while ( sueldo > 0  || meses != 12);
		
	
		System.out.print("El monto de tu sueldo actualmente es de: " + acumulador + " cobraste " +  meses + " meses");
	}

	public static void actividad_38 () {
		String admin = "admin";
		String contrase�a = "123456";
		int intentos = 3;
		
		do {
			if(intentos <= 0) {
				System.out.println("Se ha bloqueado la cuenta");
				return;
			}
			
			System.out.print("Ingresa tu usuario: ");
			String user = input.nextLine();
			System.out.print("Ingresa tu contrase�a: ");
			String password = input.nextLine();
			
			if(user.equals(admin) && password.equals(contrase�a)) {
				System.out.println("Acceso concedido");
				return;
			}

			intentos--;
			System.out.println("Completar correctamente los campos");
			System.out.println("");
		} while ( intentos >= 0);
		
	}

	public static void actividad_39 () {
		
		

	}
}
