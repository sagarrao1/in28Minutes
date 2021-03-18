package edurekha.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReaderUsingDOM {

	public static void main(String[] args) {
		try {
			File xmlfile = new File("src\\main\\resources\\students2.xml");
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(xmlfile);

			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());

			NodeList nodeList = doc.getElementsByTagName("student");
			System.out.println("--------------------------" + nodeList.getLength());

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				System.out.println("\n Current element :" + node.getNodeName());

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					System.out.println("\n Student details");
					System.out.println(eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println(eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println(eElement.getElementsByTagName("email").item(0).getTextContent());
					System.out.println(eElement.getElementsByTagName("marks").item(0).getTextContent());
				}
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
