import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, sum = 0;

		for (int i = 0; i < 5; i++) {

			System.out.println("Introduce un numero");
			num1 = sc.nextInt();

			sum = num1 + sum;

		}

		System.out.println("La suma de los numeros es: " + sum);

		sc.close();

	}

}
