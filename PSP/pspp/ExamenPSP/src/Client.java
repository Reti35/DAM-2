import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			String host = "localhost";
			int port = 5000;

			System.out.println("CLIENT : Iniciant");

			Socket client = new Socket(host, port);

			ObjectOutputStream outObject = new ObjectOutputStream(client.getOutputStream());

			System.out.println("CLIENT : Introduiu el nom d'usuari");

			String usuari = sc.next();

			Usuari usuari1 = new Usuari(usuari);

			outObject.writeObject(usuari1);

			System.out.println("CLIENT : Enviant a servidor: " + usuari1.getUsuari());

			ObjectInputStream inObject = new ObjectInputStream(client.getInputStream());

			String resposta = (String) inObject.readObject();

			System.out.println("CLIENT : Recivit de el servidor: " + resposta);

			if (resposta.equalsIgnoreCase("200 OK")) {

				System.out.println("CLIENT : Introduiu la contraseña");

				String contrasenya = sc.next();

				usuari1.setContraseña(contrasenya);

				System.out.println("CLIENT : Enviant a servidor: " + usuari1.getContrasenya());

				outObject = new ObjectOutputStream(client.getOutputStream());
				outObject.writeObject(usuari1);

				resposta = (String) inObject.readObject();

				System.out.println("CLIENT : Recivit de el servidor: " + resposta);

				if (resposta.equalsIgnoreCase("200 OK")) {

					String preparado = "PREPARADO";

					System.out.println("CLIENT : Enviant a servidor: " + preparado);

					outObject.writeObject(preparado);

					String nombreLinies = (String) inObject.readObject();
					System.out.println("CLIENT : Recivit de el servidor: Nombre de linies de 'Contenido_a_enviar.txt':"
							+ nombreLinies);

					for (int i = 0; i < Integer.valueOf(nombreLinies); i++) {

						String linea = (String) inObject.readObject();

						System.out.println("CLIENT : Recivit de el servidor: " + linea);

					}

				}

			}

			sc.close();
			client.close();
			outObject.close();
			inObject.close();
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
