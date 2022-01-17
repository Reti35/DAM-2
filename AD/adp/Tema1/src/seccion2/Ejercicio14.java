package seccion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		String linea;
		long pausa = Integer.valueOf(args[1]);

		try {

			BufferedReader fitxer = new BufferedReader(new FileReader(new File(args[0])));
			File fitxerNou = new File(args[2]);
			FileWriter wFitxerNou = new FileWriter(fitxerNou);
			PrintWriter pw = new PrintWriter(wFitxerNou);
			linea = fitxer.readLine();

			while (linea != null) {

				linea = fitxer.readLine();
				
				if (linea == null) {
					break;
				}
				
				System.out.println(linea);
				pw.println(linea);

				try {

					Thread.sleep(pausa);

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

			}
			
			fitxer.close();
			pw.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
	}

}
