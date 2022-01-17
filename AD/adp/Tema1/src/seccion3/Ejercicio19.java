package seccion3;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Ejercicio19 {

	public static void main(String[] args) throws Exception {

		File fitxer = new File("Ejercicio17.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(fitxer);
		Element raiz = document.getDocumentElement();
		NodeList nodeList = document.getElementsByTagName("libro");
		System.out.println("numero de nodos del XML " + raiz.getNodeName() + ": " + nodeList.getLength());

	}

}
