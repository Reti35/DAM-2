package seccion1;

import java.io.File;

public class Ejercicio8 {

	public static void main(String[] args) {

		File f = new File(args[0]);
		File f2 = new File(args[1]);

		if (f.mkdir()) {

			System.out.println("Creado correctamente");

		} else {

			System.out.println("Fallo al crear");

		}

		if (f.renameTo(f2)) {

			System.out.println("Renombrado correctamente");

		} else {

			System.out.println("Fallo al renombrar");

		}

		if (f.delete()) {

			System.out.println("Borrado correctamente");

		} else {

			System.out.println("Fallo al borrar");

		}

	}

}
