import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author René Clase Cliente
 *
 */
public class Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			String host = "localhost";

			int puerto = 5000;

			// Arancamos el cliente el cual recibira un objeto contraseña vacio

			System.out.println("CLIENTE >> Arranca cliente");

			Socket cliente = new Socket(host, puerto);

			ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());

			Contraseña contraseña = (Contraseña) inObjeto.readObject();

			System.out.println("CLIENTE >> Recibo del servidor: " + contraseña.getContraseña() + " - "
					+ contraseña.getContraseñaEncriptada());

			// Pedimos al usuario que introduzca una contraseña para enviarla al servidor y
			// que pueda ser encrpitada

			System.out.print("Inrtroduce una contraseña : ");

			contraseña.setContraseña(sc.next());

			ObjectOutputStream cMod = new ObjectOutputStream(cliente.getOutputStream());

			cMod.writeObject(contraseña);

			System.out.println("CLIENTE >> Envio al servidor: " + contraseña.getContraseña());

			// Recivimos de el servidor la contraseña encriptada

			contraseña = (Contraseña) inObjeto.readObject();

			System.out.println("CLIENTE >> Recibo del servidor: " + contraseña.getContraseñaEncriptada());

			inObjeto.close();
			cMod.close();
			cliente.close();
			sc.close();

		} catch (ClassNotFoundException | IOException e) {

			e.printStackTrace();

		}

	}

}
