package holamundo;

import java.io.File;

public class Ejemplo {

	public static void main(String[] args) {
		
		File fichero = new File("Rene.txt");
		System.out.println("Nombre del fichero: "+fichero.getName());
		System.out.println("Ruta: "+fichero.getPath());
		System.out.println("Ruta absoluta: "+fichero.getAbsolutePath());
		

	}

}
