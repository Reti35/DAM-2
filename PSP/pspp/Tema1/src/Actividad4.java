import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();

		System.out.println("Introduce otro numero");
		int num2 = sc.nextInt();

		if (num1 > num2) {

			System.out.println(num1 + " es mayor que " + num2);

		} else if (num1 < num2) {

			System.out.println(num1 + " es menor que " + num2);

		} else {

			System.out.println(num1 + " es igual " + num2);

		}
		
		sc.close();

	}

}
