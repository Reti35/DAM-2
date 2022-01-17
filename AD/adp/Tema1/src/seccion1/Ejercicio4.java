package seccion1;

import java.io.File;

public class Ejercicio4 {

	public static void main(String[] args) {

		File directorio = new File(args[0]);

		System.out.println(directorio.exists() ? "Existe" : "No existe");

	}

}
