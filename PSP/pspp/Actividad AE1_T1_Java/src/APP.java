import java.util.ArrayList;
import java.util.Scanner;

public class APP {

	public static void main(String[] args) {

		// Actividad 1
		System.out.println("Actividad 1");
		sayHello();
		System.out.println("");

		// Actividad 2
		System.out.println("Actividad 2");
		arrayNombres();
		System.out.println("");
		listaNombres();
		System.out.println("");

		// Actividad 3
		System.out.println("Actividad 3");
		sumarPares(args);
		System.out.println("");

		// Actividad 4
		System.out.println("Actividad 4");
		factorial();
		System.out.println("");

		// Actividad 5
		System.out.println("Actividad 5");
		mayor();
		System.out.println("");

		// Actividad 6
		System.out.println("Actividad 6");
		sumaInversos();
		System.out.println("");

		// Actividad 7
		System.out.println("Actividad 7");
		salario();
		System.out.println("");

		// Actividad 8
		System.out.println("Actividad 8");
		intervaloPrimos();
		System.out.println("");

	}

	// Actividad 1 creacion del metodo sayHello que escribe hola mundo por consola
	public static void sayHello() {

		System.out.println("Hola mundo");

	}

	// Actividad 2 mostrar 6 nombres por consola de forma consecutiva con un array
	public static void arrayNombres() {

		// Hacemos un array de strings con los nombres y lo lo recorremos con un bucle
		// for para imprimirlos
		String[] nombres = { "Rene", "Yune", "Pau", "Vicent", "Alex", "David" };

		for (int i = 0; i < nombres.length; i++) {

			System.out.println(nombres[i]);

		}

	}

	// Actividad 2 mostarar 6 nombres por consola con un objeto de tipo lista
	public static void listaNombres() {

		// Creamos un arrayList de strings y añadim els nomms per a despres imprimirlos
		// per pantalla
		ArrayList<String> lista = new ArrayList<>();

		lista.add("Rene");
		lista.add("Yune");
		lista.add("Pau");
		lista.add("Vicent");
		lista.add("Alex");
		lista.add("David");

		System.out.println(lista);

	}

	// Actividad 3 metodo que suma numeros pares hasta el numero pasado por
	// parametro
	public static void sumarPares(String args[]) {

		// Para esto hacemos un bucle for para que recorra los numeros hasta el que le
		// pasamos por parametro, luego hacemos un acondicion de que si el numero es
		// divisible entre 2 el numero es par por lo tanto entraria en la suma, y luego
		// de el bucle imprimimos el resultado de la suma por pantalla
		int numLlimit = Integer.valueOf(args[0]);
		int suma = 0;

		for (int i = 0; i <= numLlimit; i++) {

			if (i % 2 == 0) {

				suma = suma + i;

			}

		}

		System.out.println("El resultado de la suma es: " + suma);

	}

	// Actividad 4 obtener el factorial de 15 en menos de 5 instrucciones
	public static void factorial() {

		// el factorial de un numero es multiplicar todos los numeros hasta el que
		// queremos sacar el factorial multiplicando uno por el siguiente
		int num = 15;
		long factorial = 1;

		for (int cont = 1; cont <= num; cont++) {

			factorial = factorial * cont;

		}

		System.out.println("El factorial de " + num + " es: " + factorial);

	}

	// Actividad 5 devuelve el mayor de un array o una lista de numeros
	public static void mayor() {

		// Hacemos un bucle en el cual recorremos el array y si el numero actual es
		// mayor que el numero mayor hasta el momento se guarda como el numero mayor
		int[] num = { 1, 3, 8, 2, 10, 54, 4, 9, 46, 24 };
		int numMax = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > numMax) {

				numMax = num[i];

			}

		}

		System.out.println("El numero mayor es: " + numMax);

	}

	// Actividad 6 invertir numeros introducidos por teclado y sumarlos
	public static void sumaInversos() {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[4];
		int cifra, inver = 0, sumInv = 0;

		System.out.println("Introduce 5 numeros");
		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();

		}

		// Para invertir un numero hay que hacer el resto de ese numero entre 10 y
		// multiplicarlo por 10
		for (int i = 0; i < num.length; i++) {

			while (num[i] != 0) {

				cifra = num[i] % 10;
				inver = (inver * 10) + cifra;
				num[i] = num[i] / 10;

			}

			sumInv = sumInv + inver;
			sc.close();

		}

		System.out.println("La suma de los numeros inversos es: " + sumInv);

	}

	// Actividad 7 segun los años introducidos por teclado nos muestra nuestro
	// salario y rango
	public static void salario() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu mobre");
		String nombre = sc.next();
		System.out.println("Introduce tus años de experiencia");
		double años = sc.nextDouble();

		if (años < 1) {

			System.out.println(nombre + " Desarrollador Junior L1 – 15000-18000");

		}

		if (años >= 1 && años <= 2) {

			System.out.println(nombre + " Desarrollador Junior L2 – 18000-22000");

		}

		if (años >= 3 && años <= 5) {

			System.out.println(nombre + " Desarrollador Senior L1 – 22000-28000");

		}

		if (años >= 6 && años <= 8) {

			System.out.println(nombre + " Desarrollador Senior L2 – 28000-36000");

		}

		if (años > 8) {

			System.out.println(nombre + " Arquitecto. Salario a convenir en base a rol");

		}

		sc.close();
	}

	// Actividad 8 calcular los numeros primos de el rango indicado por teclado
	// indicando el tiempo que ha tardado en ejecutarlo
	public static void intervaloPrimos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero inicial");
		int numInicial = sc.nextInt();

		System.out.println("Introdice el numero final");
		int numFinal = sc.nextInt();

		// Para saber si un numero es primo tenemos que averiguar si el numero es
		// divisible solo entre 1 y el mismo, si se divide por alguno mas no es primo
		long inicio = System.nanoTime();

		for (int i = numInicial; i <= numFinal; i++) {

			int cont = 0;

			for (int j = 0; j < i; j++) {

				if ((i % j) == 0) {

					cont++;

				}

			}

			if (cont <= 2) {

				System.out.println("El numero: " + i + " es primo");

			} else {

				System.out.println("El numero: " + i + " no es primo");

			}

		}

		System.out.println(
				"El sistema ha tardado " + (System.nanoTime() - inicio) + " nanosegumdos en ejecutar el metodo");
		sc.close();

	}

}
