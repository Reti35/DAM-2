package seccion1;

import java.io.File;

import holamundo.FiltroExtension;

public class Ejercicio5 {

	public static void main(String[] args) {

		String directori = args[0];

		System.out.println("Directori: " + directori);

		File fitxer = new File(directori);

		FiltroExtension filtre = new FiltroExtension(args[1]);

		String[] lista = fitxer.list(filtre);

		for (String element : lista) {

			System.out.println(element);

		}

	}

}
