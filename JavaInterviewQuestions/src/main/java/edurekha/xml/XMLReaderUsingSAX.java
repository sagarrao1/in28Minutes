package edurekha.xml;

import org.xml.sax.helpers.*;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.*;

public class XMLReaderUsingSAX extends DefaultHandler{
	
    	public void startDocument ()
        {
    		System.out.println("Document starts here");
        }

        public void startElement (String uri, String localName,
                                  String qName, Attributes attributes)
        {
        	System.out.print("<"  +qName+  ">");
        }
        
        public void characters (char ch[], int start, int length)
        {
            System.out.print(new String(ch , start, length));
        }
        
        public void endElement (String uri, String localName, String qName) {
        	System.out.print("</"  +qName+  ">");
        }

        public void endDocument ()
        {
        	System.out.println("\nDocument ends here");
        }
	

	public static void main(String[] args) {
		try {
			SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
			saxParser.parse(new File("src\\main\\resources\\students2.xml"), new XMLReaderUsingSAX());
			
			
			
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
