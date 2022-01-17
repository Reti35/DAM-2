package tema2;


public class Actividad1 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 10;
		
		Actividad1 a = new Actividad1();
		
		System.out.println(a.sumarNumeros(num1, num2));
		
	}

	public int sumarNumeros(int num1, int num2) {

		int resultado = 0;

		for (int i = num1; i <= num2; i++) {

			resultado = resultado + i;

		}

		return resultado;

	}

}
