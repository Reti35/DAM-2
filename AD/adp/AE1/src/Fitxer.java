import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 
 * @author René Ribera Medrano 15/09/2021 Acces a dades
 *
 */

public class Fitxer {

	File directori;
	Date ultimaModificacio;

	public Fitxer() {

	}

	public Fitxer(File directori) {

		this.directori = directori;
		ultimaModificacio = new Date(directori.lastModified());

	}

	// Este metode ens donara la informació de el fitxer o directori
	public void getInformacio() {

		// Obtenim el nom de el fitxer o directory am el metode getNane de la clase file
		System.out.println("Nom: " + directori.getName());

		// Mostra la ruta de el directori
		System.out.println("Ruta: " + directori.getPath());

		// Mostra la fecha de la ultima modificacio
		System.out.println("Ultima modificacio: " + ultimaModificacio);

		// Mostra si esta ocult o no
		System.out.println("Ocult: " + directori.isHidden());

		// Comproba si es un fitxer o un directori y en el cas de ser un fitxer mostra
		// que es un fitxer y la seua grandaria, en cas contrari mostra que es un
		// directori a mes de mostrar el contingut de el mateix
		if (directori.isDirectory()) {

			// Per a mostrar el contingut de el directori itilitzem el metode list de la
			// clase file que ens dona un array, el recorrerem y mostrarem
			System.out.println("Es un directori");
			for (int i = 0; i < directori.list().length; i++) {

				System.out.println(directori.list()[i]);

			}

			System.out.println("Espai total: " + directori.getTotalSpace());
			System.out.println("Espai lliure: " + directori.getFreeSpace());
			System.out.println("Espai disponible: " + directori.getUsableSpace());

		} else if (directori.isFile()) {

			System.out.println("Es un fitxer");

			// Per a mostrar la grandaria del fitxer amb el metode length de la clase file
			System.out.println("Grandaria: " + directori.length());

		}

	}

	// Este metode crea carpetes amb la funcionalitat mkdir de la clase File, tambe
	// se indica si s'ha creat correctament el directori
	public void crearCarpeta(File nouDirectori) {

		try {

			nouDirectori.mkdir();
			System.out.println("Directori creat correctament");

		} catch (Exception e) {

			System.out.println("Error al crear el directori");
			e.printStackTrace();

		}

	}

	// Este metode crea fitxers amb la funcionalitat createNewFile de la clase File
	public void crearFitxer(File nouFitxer) {

		try {

			nouFitxer.createNewFile();
			System.out.println("Fitxer creat correctament");

		} catch (IOException e) {

			System.out.println("Error al crear el fitxer");
			e.printStackTrace();

		}

	}

	// Elimina el directori o fitxer pasat per parametre
	public void elimina(File directoriEliminar) {

		try {

			directoriEliminar.delete();
			System.out.println("Directori o fitxer eliminat correctament");

		} catch (Exception e) {

			System.out.println("Error al eliminar el directori o el fitxer");
			e.printStackTrace();
		}

	}

	// Renomena el directori actual amb el pasat per parametre
	public void renomena(File directori, File directoriRenomenat) {

		try {

			directori.renameTo(directoriRenomenat);
			System.out.println("Directori o fitxer renomenat correctament");

		} catch (Exception e) {

			System.out.println("Error al renomenta el directori o el fitxer");
			e.printStackTrace();

		}

	}

}
