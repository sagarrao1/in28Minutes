package edurekha.xml;

import org.xml.sax.helpers.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.xml.sax.*;

public class XMLReaderUsingStAX extends DefaultHandler {

	public static void main(String[] args) {

		boolean bFirstName = false;
		boolean bLastName = false;
		boolean bemail = false;
		boolean bmarks = false;

		try {

			XMLInputFactory factory = XMLInputFactory.newFactory().newInstance();
			XMLEventReader eventReader = factory
					.createXMLEventReader(new FileReader("src\\main\\resources\\students2.xml"));

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				switch (event.getEventType()) {

				case XMLStreamConstants.START_ELEMENT:
					StartElement startElement = event.asStartElement();
					String qName = startElement.getName().getLocalPart();
					if (qName.equalsIgnoreCase("student")) {
						System.out.println("Start element : student");
					} else if (qName.equalsIgnoreCase("firstname")) {
						bFirstName = true;
					} else if (qName.equalsIgnoreCase("lasttname")) {
						bLastName = true;
					} else if (qName.equalsIgnoreCase("email")) {
						bemail = true;
					} else if (qName.equalsIgnoreCase("marks")) {
						bmarks = true;
					}

					break;

				case XMLStreamConstants.CHARACTERS:
					Characters characters = event.asCharacters();
					
					if(bFirstName) {
						System.out.println("FirstName : " +characters.getData());
						bFirstName=false;
					}
					
					if(bLastName) {
						System.out.println("LastName : " +characters.getData());
						bLastName=false;
					}
					
					if(bemail) {
						System.out.println("email : " +characters.getData());
						bemail=false;
					}
					
					if(bmarks) {
						System.out.println("Marks : " +characters.getData());
						bmarks=false;
					}
					
					break;

				case XMLStreamConstants.END_ELEMENT:

					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart().equalsIgnoreCase("student")) {
						System.out.println("End Element : student");
						System.out.println();
					}
					break;

				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
