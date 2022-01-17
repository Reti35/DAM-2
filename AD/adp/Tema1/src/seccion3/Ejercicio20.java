package seccion3;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ejercicio20 {

	public static void main(String[] args) throws Exception {

		File fitxer = new File("Ejercicio17.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(fitxer);
		Element raiz = document.getDocumentElement();
		System.out.println("Contenido XML " + raiz.getNodeName() + ":");
		NodeList nodeList = document.getElementsByTagName("libro");

		for (int i = 0; i < nodeList.getLength(); i++) {
			
			Node node = nodeList.item(i);
			System.out.println("");
			
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				
				Element eElement = (Element) node;
				System.out.println("Titulo: " + eElement.getElementsByTagName("titulo").item(0).getTextContent());
				System.out.println("Autor: " + eElement.getElementsByTagName("autor").item(0).getTextContent());
				System.out.println("Fecha de publicación: " + eElement.getElementsByTagName("fechaPublicacion").item(0).getTextContent());
				
			}

		}

	}

}
