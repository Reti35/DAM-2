package NEO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int numCores = Runtime.getRuntime().availableProcessors();

		Main m = new Main();
		String nombreNEO;
		Double posicionNEO;
		Double velocidadNEO;
		ArrayList<String> neo = m.leerFichero();

		for (int a = 0; a < numCores; a++) {

			nombreNEO = neo.get(a).substring(0, neo.get(a).indexOf(","));
			posicionNEO = Double.valueOf(neo.get(a).substring((neo.get(a).indexOf(",") + 1), neo.get(a).lastIndexOf(",")));
			velocidadNEO = Double.valueOf(neo.get(a).substring(neo.get(a).lastIndexOf(",") + 1));

			m.lanzarCalcularNEO(posicionNEO, velocidadNEO, nombreNEO);

		}

	}

	public ArrayList<String> leerFichero() {

		ArrayList<String> lineas = new ArrayList<>();
		String texto = "NEOs.txt";
		String linea;

		try {

			BufferedReader lector = new BufferedReader(new FileReader(new File(texto)));
			linea = lector.readLine();

			while (linea != null) {

				lineas.add(linea);

				linea = lector.readLine();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		return lineas;

	}

	@SuppressWarnings("unused")
	public void lanzarCalcularNEO(Double posicionNEO, Double velocidadNEO, String nombreNEO) {

		String clase = "NEO.CalcularNeo";
		try {

			String javaHome = System.getProperty("java.home");
			String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
			String classpath = System.getProperty("java.class.path");
			String className = clase;

			List<String> command = new ArrayList<>();
			command.add(javaBin);
			command.add("-cp");
			command.add(classpath);
			command.add(className);
			command.add(posicionNEO.toString());
			command.add(velocidadNEO.toString());
			command.add(nombreNEO);

			ProcessBuilder builder = new ProcessBuilder(command);
			Process process = builder.inheritIO().start();
			// process.waitFor();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
