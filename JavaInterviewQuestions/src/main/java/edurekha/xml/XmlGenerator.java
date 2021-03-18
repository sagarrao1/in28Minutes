package edurekha.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class XmlGenerator {

	public static void main(String[] args) {
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = null;

		try {
			b = f.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		Document doc = createDocument(b);

		Transformer t = null;

		try {
			t = TransformerFactory.newInstance().newTransformer();
		} catch (TransformerConfigurationException | TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}

		try {
			t.transform(new DOMSource(doc),
					new StreamResult(new FileOutputStream("src\\main\\resources\\students.xml")));

		} catch (FileNotFoundException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("XML file generated ...");

	}

	private static Document createDocument(DocumentBuilder b) {
		Document doc = b.newDocument();
		Element rootel = doc.createElement("students");
		Element studentel = doc.createElement("student");
		Element firstnameel = doc.createElement("firstname");
		Element lastnameel = doc.createElement("lastname");
		Element emailel = doc.createElement("email");
		Element marksel = doc.createElement("marks");

		Text t1 = doc.createTextNode("Sagar ");
		Text t2 = doc.createTextNode("rao");
		Text t3 = doc.createTextNode("sagarrao1@gmail.com");
		Text t4 = doc.createTextNode("99");

		firstnameel.appendChild(t1);
		lastnameel.appendChild(t2);
		emailel.appendChild(t3);
		marksel.appendChild(t4);

		studentel.appendChild(firstnameel);
		studentel.appendChild(lastnameel);
		studentel.appendChild(emailel);
		studentel.appendChild(marksel);

		rootel.appendChild(studentel);
		doc.appendChild(rootel);
		return doc;
	}

}
