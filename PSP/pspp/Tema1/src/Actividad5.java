import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num2, num1;
		do {

			System.out.println("Introduce un numero");
			num1 = sc.nextInt();

			System.out.println("Introduce otro numero");
			num2 = sc.nextInt();

		} while (num1 != num2);

		System.out.println(num1 + " es igual " + num2);
		
		sc.close();

	}

}
