import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		File directori = new File(args[0]);
		File nouDirectori = new File(args[1]);
		File nouFitxer = new File(args[2]);
		File directoriEliminar = new File(args[2]);
		File directoriRenomenat = new File(args[3]);
		Fitxer fitxerDirectori = new Fitxer(directori);
		int opcio;

		do {

			System.out.println("Tria una opcio");
			System.out.println("1) Mostrar la informacio del directori o fitxer");
			System.out.println("2) Crear un nou directori");
			System.out.println("3) Crear un nou fitcher");
			System.out.println("4) Eliminar un fitxer o directori");
			System.out.println("5) Renomena un fitxer o directori");
			System.out.println("6) Tancar el programa");
			opcio = sc.nextInt();

			switch (opcio) {
			case 1: {

				fitxerDirectori.getInformacio();
				break;

			}

			case 2: {

				fitxerDirectori.crearCarpeta(nouDirectori);
				break;

			}

			case 3: {

				fitxerDirectori.crearFitxer(nouFitxer);
				break;

			}

			case 4: {

				fitxerDirectori.elimina(directoriEliminar);
				break;

			}

			case 5: {

				fitxerDirectori.renomena(nouDirectori, directoriRenomenat);
				break;

			}
			
			case 6:{
				
				System.out.println("Programa tancat");
				sc.close();
				break;
				
			}

			default:

				System.out.println("Opcion incorrecta");

			}

		} while (opcio != 6);

	}

}
