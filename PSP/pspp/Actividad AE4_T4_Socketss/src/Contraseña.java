import java.io.Serializable;

/**
 * 
 * @author René
 * Clase Contraseña
 *
 */
public class Contraseña implements Serializable {

	// Parametros
	private static final long serialVersionUID = 1L;
	String contraseña;
	String contraseñaEncriptada;

	// Constructores
	public Contraseña() {

	}

	public Contraseña(String contraseña, String contraseñaEncriptada) {

		this.contraseña = contraseña;
		this.contraseñaEncriptada = contraseñaEncriptada;

	}

	// Getters y Setters
	public Contraseña(String contraseña) {

		this.contraseña = contraseña;

	}

	public String getContraseña() {

		return contraseña;

	}

	public void setContraseña(String contraseña) {

		this.contraseña = contraseña;

	}

	public String getContraseñaEncriptada() {

		return contraseñaEncriptada;

	}

	public void setContraseñaEncriptada(String contraseñaEncriptada) {

		this.contraseñaEncriptada = contraseñaEncriptada;

	}

	/**
	 * Metodo que dado una contraseña la encripta cambiando los caracteres por los
	 * siguientes en la tabla ascii.
	 * 
	 * @param contraseña
	 * @return contraseñaEncriptada
	 */

	public String encriptarContraseña(String contraseña) {

		String contraseñaEncriptada = "";

		byte[] pass = contraseña.getBytes();

		for (int i = 0; i < pass.length; i++) {

			int valorAscii = pass[i] + 1;

			contraseñaEncriptada = contraseñaEncriptada + Character.toString(valorAscii);

		}

		return contraseñaEncriptada;

	}

}
