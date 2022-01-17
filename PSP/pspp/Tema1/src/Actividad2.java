import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un nombre");
		String nombre = sc.next();

		System.out.println("Hola " + nombre);

		sc.close();
	}

}
