package seccion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio12 {

	public static void main(String[] args) {

		String linea;

		try {

			BufferedReader fitxer = new BufferedReader(new FileReader(new File(args[0])));
			linea = fitxer.readLine();

			while (linea != null) {

				System.out.println(linea);
				linea = fitxer.readLine();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
	

}
