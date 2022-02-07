import java.io.Serializable;

public class Usuari implements Serializable{

	private static final long serialVersionUID = 1L;
	private String usuari;
	private String contrasenya;

	public Usuari() {

	}

	public Usuari(String usuari) {
		this.usuari = usuari;
	}

	public String getUsuari() {
		return usuari;
	}

	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContraseña(String contrasenya) {
		this.contrasenya = contrasenya;
	}

}
