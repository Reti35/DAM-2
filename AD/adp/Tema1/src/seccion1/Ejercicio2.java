package seccion1;

import java.io.File;

public class Ejercicio2 {

	public static void main(String[] args) {

		File directorio = new File(args[0]);

		System.out.println("Nomre de el directorio: " + directorio.getName());
		System.out.println("Ruta: " + directorio.getPath());
		System.out.println("Ruta absoluta: " + directorio.getAbsolutePath());
		System.out.println("Lectura: " + directorio.canRead());
		System.out.println("Escritura: " + directorio.canWrite());
		System.out.println("Ejecucion: " + directorio.canExecute());
		System.out.println("Directorio: " + directorio.isDirectory());
		
		

	}

}
