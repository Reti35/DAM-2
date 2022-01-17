package tema2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Actividad2 {

	public static void main(String[] args) {

		Actividad2 lanzador = new Actividad2();

		lanzador.ejecutarSuma(1, 10);
		
	}

	public void ejecutarSuma(int num1, int num2) {

		String clase = "tema2.Actividad1";

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
			command.add(String.valueOf(num1));
			command.add(String.valueOf(num2));

			ProcessBuilder builder = new ProcessBuilder(command);
			Process proceso = builder.inheritIO().start();
			proceso.waitFor();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
