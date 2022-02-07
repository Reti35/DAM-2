import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {

		try {

			int port = 5000;

			ServerSocket server = new ServerSocket(port);

			System.err.println("SERVER : Esperant client");

			Socket client = server.accept();

			ObjectInputStream inObject = new ObjectInputStream(client.getInputStream());

			Usuari usuari1 = (Usuari) inObject.readObject();

			System.err.println("SERVER : Recivit de el client: " + usuari1.getUsuari());

			String resposta = comprobarUsuari(usuari1.getUsuari());

			System.err.println("SERVER : Enviant a client: " + resposta);

			ObjectOutputStream outObject = new ObjectOutputStream(client.getOutputStream());

			outObject.writeObject(resposta);

			inObject = new ObjectInputStream(client.getInputStream());
			usuari1 = (Usuari) inObject.readObject();

			System.err.println("SERVER : Recivit de el client: " + usuari1.getContrasenya());

			resposta = comprobarContraseña(usuari1.getUsuari(), usuari1.getContrasenya());

			System.err.println("SERVER : Enviant a client: " + resposta);

			outObject.writeObject(resposta);

			String preparado = (String) inObject.readObject();

			System.err.println("SERVER : Recivit de el client: " + preparado);

			if (preparado.equalsIgnoreCase("PREPARADO")) {

				String nombreLinies = contarLinies();

				System.err.println(
						"SERVER : Enviant a client: Nombre de linies de 'Contenido_a_enviar.txt': " + nombreLinies);

				outObject.writeObject(nombreLinies);

				contingutFicher(outObject);

			}

			outObject.close();
			inObject.close();
			client.close();
			server.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static String comprobarUsuari(String usuari) {

		String resposta = "ERROR";

		try {

			String linea;

			BufferedReader fitxer = new BufferedReader(new FileReader(new File("Usuarios_autorizados.txt")));
			linea = fitxer.readLine();

			while (linea != null) {

				if (linea.equalsIgnoreCase(usuari)) {

					resposta = "200 OK";

				}

				linea = fitxer.readLine();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		return resposta;
	}

	public static String comprobarContraseña(String usuari, String contraseña) {

		String resposta = "ERROR";

		try {

			String linea;

			BufferedReader fitxer = new BufferedReader(new FileReader(new File("Contrasenyas_autorizadas.txt")));
			linea = fitxer.readLine();

			while (linea != null) {

				if (linea.equalsIgnoreCase(contraseña)) {

					if (contraseña.equalsIgnoreCase("admin123") && usuari.equalsIgnoreCase("admin")) {

						resposta = "200 OK";

					}

					if (contraseña.equalsIgnoreCase("root123") && usuari.equalsIgnoreCase("root")) {

						resposta = "200 OK";

					}

					if (contraseña.equalsIgnoreCase("user123") && usuari.equalsIgnoreCase("user")) {

						resposta = "200 OK";

					}

				}

				linea = fitxer.readLine();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		return resposta;
	}

	public static String contarLinies() {

		String nobreLinies;
		int cont = 0;

		try {

			String linea;

			BufferedReader fitxer = new BufferedReader(new FileReader(new File("Contenido_a_enviar.txt")));
			linea = fitxer.readLine();

			while (linea != null) {

				cont++;
				linea = fitxer.readLine();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		nobreLinies = String.valueOf(cont);

		return nobreLinies;
	}

	public static void contingutFicher(ObjectOutputStream outObject) {

		try {

			String linea;

			BufferedReader fitxer = new BufferedReader(new FileReader(new File("Contenido_a_enviar.txt")));
			linea = fitxer.readLine();
			outObject.writeObject(linea);

			while (linea != null) {

				System.err.println("SERVER : Enviant a client: " + linea);

				linea = fitxer.readLine();

				outObject.writeObject(linea);

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
