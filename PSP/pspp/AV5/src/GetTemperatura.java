import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class GetTemperatura implements HttpHandler {

        public GestorHttp gestor;

        public GetTemperatura(GestorHttp gestor) {
            this.gestor = gestor;
        }

        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "Temperatura actual = " + gestor.getTemperaturaActual() + "C\n" + "Temperatura Termo = " + gestor.getTemperaturaTermo() + "C";
            System.out.println(response);

            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

		
    }