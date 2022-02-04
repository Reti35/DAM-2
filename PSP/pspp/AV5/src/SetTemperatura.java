import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class SetTemperatura implements HttpHandler {

	public GestorHttp gestor;

	public SetTemperatura(GestorHttp gestor) {
		this.gestor = gestor;
	}

	@Override
	public void handle(HttpExchange exchange) throws IOException {
		String response = "";

		// Obtindre la url de la peticion
		String url = exchange.getRequestURI().toString();

		// Obtindre la parte de despues del "=" de la url
		String parametre = url.substring(url.indexOf("=") + 1);

		// Obtindre la temperatura
		int temperatura = Integer.parseInt(parametre);

		// Enviar la temperatura al termostate

		response = "La temperatura actual es: " + gestor.getTemperaturaActual() + " graus"
				+ "\nLa temperatura del termo es: " + gestor.getTemperaturaTermo() + " graus"
				+ "\nLa temperatura desitjada es :" + temperatura + " graus";

		exchange.sendResponseHeaders(200, response.length());
		OutputStream os = exchange.getResponseBody();
		os.write(response.getBytes());

		// Cada 5 segundos subir 1 grado a la temperatura del termostato y actual hasta
		// la temperatura deseada
		try {

			while (gestor.getTemperaturaTermo() < temperatura) {
				if (gestor.getTemperaturaTermo() < temperatura) {
					gestor.setTemperaturaTermo(gestor.getTemperaturaTermo() + 1);
					gestor.setTemperaturaActual(gestor.getTemperaturaActual() + 1);
					response = "La temperatura actual es: " + gestor.getTemperaturaActual() + " graus"
							+ "\nLa temperatura del termo es: " + gestor.getTemperaturaTermo() + " graus"
							+ "\nLa temperatura desitjada es :" + temperatura + " graus";
					System.out.println(response);
					Thread.sleep(5000);
				}
			}

			os.write(response.getBytes());
			os.close();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
