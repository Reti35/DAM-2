import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Modelo {

	private String fichero_lectura;
	private String fichero_escritura;

	public Modelo() {
		fichero_lectura = "AE02_T1_2_Streams_Groucho.txt";
		fichero_escritura = "ficheroEscritura.txt";
	}

	public String contenidoFichero() {
        String text = "";

        try {
            BufferedReader fitxer = new BufferedReader(new FileReader(fichero_lectura));
            String linea = "";

            while ((linea = fitxer.readLine()) != null) {
                text = text + linea + "\n";
            }

            fitxer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }


	// Este metodo devuelve un string que contiene el nombre del fichero de lectura
	public String ficheroLectura() {

		return fichero_lectura;

	}

	// Este metodo devuelve un string que contiene el nombre del fichero de
	// escritura
	public String ficheroEscritura() {

		return fichero_escritura;

	}

	// Este metodo devuelve un entero con el numero de coincidencias del string
	// textoBuscar en el contenido del texto
	// Debera recorrer todo el contenido del texto e ir buscando una a una las
	// coincidencias
	// Pistas: se puede buscar linea a linea, se puede utilizar el metodo indexOf de
	// la clase String
	public int buscarTexto(String textoBuscar) {

		int numCoincidencias = 0;
		String linea;

		try {

			BufferedReader fitxer = new BufferedReader(new FileReader(new File(fichero_lectura)));
			linea = fitxer.readLine();

			while (linea != null) {

				while (linea.indexOf(textoBuscar) > -1) {

					linea = linea.substring(linea.indexOf(textoBuscar) + textoBuscar.length(), linea.length());

					numCoincidencias++;
					
				}
				
				linea = fitxer.readLine();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		return numCoincidencias;

	}

	// Este metodo debe leer el contenido del fichero de lectura y reemplazar las
	// coincidencias que haya de textoBuscar con
	// el string textoReemplazar
	// Pistas: procesar el texto linea a linea, utilizar el metodo replaceAll de la
	// clase String
	
	
	public void guardarTextoEscritura(String texto) {
		
			BufferedWriter fitxer;
			try {
				
				fitxer = new BufferedWriter(new FileWriter(fichero_escritura));
				fitxer.write(texto);
				fitxer.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		
	}

}