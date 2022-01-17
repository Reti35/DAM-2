import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author René Clase Servidor
 *
 */
public class Servidor {

	public static void main(String[] args) {

		try {

			// Iniciamos el servidor que esperara a que se inicie el cliente

			int numeroPuerto = 5000;

			ServerSocket servidor = new ServerSocket(numeroPuerto);

			System.err.println("SERVIDOR >> Escuchando...");

			// Una vez se conecta el cliente le envia una contraseña vacia

			Socket cliente = servidor.accept();

			ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());

			Contraseña contraseña = new Contraseña("", "");

			outObjeto.writeObject(contraseña);

			System.err.println("SERVIDOR >> Envio a cliente: " + contraseña.getContraseña() + " - "
					+ contraseña.getContraseñaEncriptada());

			// Recivimos la contraseña a encriptar

			ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());

			Contraseña cMod = (Contraseña) inObjeto.readObject();

			System.err.println("SERVIDOR >> Recibo de cliente: " + cMod.getContraseña());
			System.err.println("SERVIDOR >> Encriptando contraseña");

			// Encriptamos la contraseña y la volvemos a mandar a el cliente

			cMod.setContraseñaEncriptada(cMod.encriptarContraseña(cMod.getContraseña()));

			System.err.println(
					"SERVIDOR >> Envio a cliente: " + cMod.getContraseña() + " - " + cMod.getContraseñaEncriptada());

			outObjeto.writeObject(cMod);

			outObjeto.close();
			inObjeto.close();
			cliente.close();
			servidor.close();

		} catch (ClassNotFoundException | IOException e) {

			e.printStackTrace();

		}

	}
}
