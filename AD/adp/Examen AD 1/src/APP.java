import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class APP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conexion = null;
		ResultSet resultSet;
		Statement statement;

		try {
			
			File fitxer = new File("config.xml");
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(fitxer);
			NodeList nodeList = document.getElementsByTagName("config1");
			
			Node node = nodeList.item(0);
			
			Element eElement = (Element) node;
			
			String url = eElement.getElementsByTagName("url").item(0).getTextContent();
			String user = eElement.getElementsByTagName("user").item(0).getTextContent();
			String password = eElement.getElementsByTagName("password").item(0).getTextContent();
			
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(url, user, password);
			statement = conexion.createStatement();
			
			String sql = "SELECT `id`, `nom` FROM preus";
			
			resultSet = statement.executeQuery(sql);
			
			System.out.println("Llista de destinacions");
			System.out.println();
			
			while (resultSet.next()) {
				
				System.out.println("ID: " + resultSet.getString("id") + " Nom: " + resultSet.getString("nom"));
				
			}
			
			System.out.println();
			System.out.println("Introdueix el id de la destinacio de la cual vuigues saber el preu");
			System.out.println();
			
			int id = sc.nextInt(); 
			
			if (id > 5 || id < 1) {
				
				System.out.println("ID incorrecto");
				
			}
			
			sql = "SELECT `nom`,`preu` FROM `preus` WHERE id = " + id;
			
			resultSet = statement.executeQuery(sql);
			String linea = "";
			
			while (resultSet.next()) {
				
				linea = "Nom: " + resultSet.getString("nom") + " Preu: " + resultSet.getString("preu") + "€";
				
				System.out.println(linea);
				
			}
			
			File consulta = new File(".");
			
			consulta.createNewFile();
			Date date = new Date(consulta.lastModified());
			String fecha = new SimpleDateFormat("yyMMddhhmm").format(date);
			String rename = "consulta " + fecha + ".txt";
						
			consulta = new File(rename);
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(consulta));
			
			bufferedWriter.write(linea);
			bufferedWriter.close();
			
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
			
		}
			
		
	}

}
