package NEO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CalcularNeo {

	public static void main(String[] args) {

		CalcularNeo cn = new CalcularNeo();

		Double posicionNEO = Double.valueOf(args[0]);
		Double velocidadNEO = Double.valueOf(args[1]);
		String nombreNeo = args[2];
		double porcentaje = Math.round(cn.calculoNeo(posicionNEO, velocidadNEO) * 100.0) / 100.0;
		String res = nombreNeo + " tiene: " + porcentaje + "% de probabilidades de impactar";
		String peligro;
		
		System.out.println(res);


		if (porcentaje >= 10) {
			
			peligro = nombreNeo + " tiene peligro de impacto";
			System.out.println(peligro);

		} else {

			peligro = nombreNeo + " no tiene peligro de impacto";
			System.out.println(peligro);

		}


		try {

			BufferedWriter bf = new BufferedWriter(new FileWriter(cn.crearArchivo(nombreNeo)));
			bf.write(res+"\n");
			bf.write(peligro);
			bf.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public double calculoNeo(Double posicionNEO, Double velocidadNEO) {

		double posicionTierra = 1;
		double velocidadTierra = 100;

		for (int i = 0; i < (50 * 365 * 24 * 60 * 60); i++) {

			posicionNEO = posicionNEO + velocidadNEO * i;
			posicionTierra = posicionTierra + velocidadTierra * i;

		}

		double resultado = 100 * Math.random()
				* Math.pow(((posicionNEO - posicionTierra) / (posicionNEO + posicionTierra)), 2);

		return resultado;

	}

	public File crearArchivo(String nombreNEO) {

		File neo = new File(nombreNEO + ".txt");

		try {

			neo.createNewFile();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return neo;

	}

}
