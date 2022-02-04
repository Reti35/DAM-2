import java.net.Socket;

public class GestorHttp {

	private Socket socket;
	private double temperaturaActual;
	private double temperaturaTermo;

	public GestorHttp() {
		this.temperaturaActual = 15.0;
		this.temperaturaTermo = 15.0;
	}

	public double getTemperaturaActual() {
		return temperaturaActual;
	}

	public double getTemperaturaTermo() {
		return temperaturaTermo;
	}

	public void setTemperaturaActual(double temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
	}

	public void setTemperaturaTermo(double temperaturaTermo) {
		this.temperaturaTermo = temperaturaTermo;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

}
