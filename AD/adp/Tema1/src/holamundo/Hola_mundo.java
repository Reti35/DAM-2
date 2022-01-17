package holamundo;
import java.util.Scanner;

public class Hola_mundo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre = args[0];
		String nom = sc.next();

		System.out.println("Hola " + nombre);

		System.out.println("Hola " + nom);

		sc.close();

	}

}
