package principal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de personas");
		int numeroPersonas = sc.nextInt();
		
		lanzarSubproceso(numeroPersonas);
		
		sc.close();

	}
	
	public static void lanzarSubproceso(Integer numeroPersonas) {
		
		String clase = "clases.Subproceso";
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
			command.add(numeroPersonas.toString());

			ProcessBuilder builder = new ProcessBuilder(command);
			Process process = builder.inheritIO().start();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
