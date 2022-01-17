package seccion2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio9 {

	public static void main(String[] args) {

		int caracter;

		try {

			FileReader fitxer = new FileReader(new File(args[0]));
			caracter = fitxer.read();

			while (caracter != -1) {

				System.out.println((char) caracter);
				caracter = fitxer.read();

			}

			fitxer.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
