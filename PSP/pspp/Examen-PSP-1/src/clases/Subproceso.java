package clases;

import java.util.ArrayList;

public class Subproceso {

	public static void main(String[] args) {
		
		int numPersonas = Integer.parseInt(args[0]);

		ArrayList<String> coloresFavoritos = new ArrayList<>();

		for (int i = 0; i < numPersonas; i++) {

			String[] colores = { "amarillo", "verde", "rojo", "azul", "naranja" };

			int numeroAleatorio = (int) Math.round(Math.random() * 4);

			String colorFavorito = colores[numeroAleatorio];

			System.out.println("La persona : " + i + " ha elegido el color " + colorFavorito);

			coloresFavoritos.add(colorFavorito);

		}

		System.out.println("El tamaño de la lista es : " + coloresFavoritos.size());
		System.out.println("El numero de personas es : " + numPersonas);

	}

}
