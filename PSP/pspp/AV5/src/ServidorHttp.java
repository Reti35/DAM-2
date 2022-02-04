import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

/**
 * 
 * @author René Ribera Medrano
 * 
 * Clase servidor HTTP
 *
 */
public class ServidorHttp {
	
	public static void main(String[] args) {
		
		try {
			
			GestorHttp gestor = new GestorHttp();
			HttpServer server = HttpServer.create(new InetSocketAddress(7777), 0);
			server.createContext("/estufa/GetTemperatura", new GetTemperatura(gestor));
			System.out.println("Servidor iniciado");
			System.out.println("URL: http://localhost:7777/estufa/temperaturaActual");
			
			server.createContext("/estufa/NovaTemperatura=", new SetTemperatura(gestor));
			System.out.println("URL: http://localhost:7777/estufa/NovaTemperatura=");
			server.setExecutor(null); 
			server.start();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
