import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, sum = 0, i = 0;

		while (i < 5) {

			System.out.println("Introduce un numero");
			num1 = sc.nextInt();

			sum = num1 + sum;

			i++;

		}

		System.out.println("La suma de los numeros es: " + sum);

		sc.close();

	}

}