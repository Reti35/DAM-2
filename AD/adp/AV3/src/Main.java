import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcio = 0;
		int identificador = 0;
		String titol;
		String autor;
		int anyPublicacio;
		String editorial;
		int nombrePagines;
		Biblioteca biblioteca = new Biblioteca();
		
		System.out.println("Benvingut a la biblioteca");

		do {
			
			System.out.println("Trie una opcio : ");
			System.out.println("1) Mostrar tots els títols de la biblioteca");
			System.out.println("2) Mostrar informació detallada d’un llibre");
			System.out.println("3) Crear nou llibre");
			System.out.println("4) Actualitzar llibre");
			System.out.println("5) Borrar llibre");
			System.out.println("6) Tanca la biblioteca");
			opcio = sc.nextInt();
			
			
			switch (opcio) {
			
			case 1:
				
				ArrayList<Llibre> llista = biblioteca.recuperarTots();
				
				for (int i = 0; i < llista.size(); i++) {
					
					biblioteca.mostrarLlibre(llista.get(i));
					System.out.println("");
					
				}
				
				
				break;
			
			case 2:
				
				System.out.println("Introduiu el identificador del llibre que voleu mostrar : ");
				identificador = sc.nextInt();
				biblioteca.mostrarLlibre(biblioteca.recuperarLlibre(identificador));
				
				break;
				
			case 3:
				Llibre llibre = new Llibre();
				
				System.out.println("Introduiu l'identificador : ");
				identificador = sc.nextInt();
				llibre.setIdentificador(identificador);
				
				System.out.println("Introduiu el titol : ");
				titol = sc.next();
				llibre.setTitol(titol);
				
				System.out.println("Introduiu l'autor : ");
				autor = sc.next();
				llibre.setAutor(autor);
				
				System.out.println("Introduiu l'any de publicació : ");
				anyPublicacio = sc.nextInt();
				llibre.setAnyPublicacio(anyPublicacio);
				
				System.out.println("Introduiu l'editorial : ");
				editorial = sc.next();
				llibre.setEditorial(editorial);
				
				System.out.println("Introduiu el nombre de pagines : ");
				nombrePagines = sc.nextInt();
				llibre.setNombrePagines(nombrePagines);
				
				System.out.println("Identificador del nou llibre : " + biblioteca.crearLlibre(llibre));
				
				break;
				
			case 4:
				
				System.out.println("Introduiu el identificador del llibre que voleu actualitzar : ");
				identificador = sc.nextInt();
				biblioteca.actualitzaLlibre(identificador);
				
				break;
				
			case 5:
				
				System.out.println("Introduiu l'identificador del llibre a borrar : ");
				identificador = sc.nextInt();
				biblioteca.borrarLlibre(identificador);
				
				break;
				
			case 6:
				
				break;

			default:
				
				System.out.println("Opció incorrecta");
				
				break;
				
			}
			
			
		} while (opcio != 6);
		
		System.out.println("Gracias por utilizar este programa");
		
		sc.close();
	}

}
