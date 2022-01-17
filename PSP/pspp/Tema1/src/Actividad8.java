import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();
		
		if (num1 == 1) {
			
			System.out.println("Enero");
			
		} else if(num1==2) {
			
			System.out.println("Febrero");
			
		}else if(num1==3) {
			
			System.out.println("Marzo");
			
		}else if(num1==4) {
			
			System.out.println("Abril");
			
		}else if(num1==5) {
			
			System.out.println("Mayo");
			
		}else if (num1==6) {
			
			System.out.println("Junio");
			
		}
		
		sc.close();
		
	}

}
