
public class Ejercicio1 {

	public static void main(String[] args) {

		String url = "http://localhost:80" + "/xampp/webdav/webdav.txt";
		String fichero = "webdav.txt";
		new Descargas(url, fichero);

	}

}
