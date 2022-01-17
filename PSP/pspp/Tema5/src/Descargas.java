import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Descargas {
	
	public Descargas(String url, String archivo) {
		
		System.out.println("Descargando " + url);
		try {
			
		URL laUrl=new URL(url);
		InputStream is=laUrl.openStream();
		InputStreamReader reader=new InputStreamReader(is);
		BufferedReader bReader=new BufferedReader(reader);
		FileWriter escritorFichero=new FileWriter(archivo);
		String linea;
		
		while ((linea=bReader.readLine())!=null){
			
		escritorFichero.write(linea);
		
		}
		
		escritorFichero.close();
		bReader.close();
		reader.close();
		is.close();
		
		} catch (MalformedURLException e) {
			
		System.out.println("URL mal escrita!");
		
		} catch (IOException e) {
			
		System.out.println("Fallo en la lectura del fichero");
		
		}
		
	}

}
