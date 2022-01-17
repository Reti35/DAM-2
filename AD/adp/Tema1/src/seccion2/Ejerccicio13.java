package seccion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejerccicio13 {

	public static void main(String[] args) {

		String linea;
		long pausa = Integer.valueOf(args[1]);

		try {

			BufferedReader fitxer = new BufferedReader(new FileReader(new File(args[0])));
			linea = fitxer.readLine();

			while (linea != null) {

				System.out.println(linea);
				linea = fitxer.readLine();

				try {

					Thread.sleep(pausa);

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

			}
			
			fitxer.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
	}

}
