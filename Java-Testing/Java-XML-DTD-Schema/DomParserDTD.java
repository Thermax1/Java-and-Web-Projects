import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class DomParserDTD {

    public static void main(String[] args) { //some code copied over form DomParserSchema
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true); //enables DTD validation
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("videogames.xml")); //parses xml and checks dtd. If something is off, I get an error to xml file, meaning DTD is wrong. Example: Element tpe "collection must be decalred" means collection in dtd isn't proper

            System.out.println("Your DTD has been validated against the XML. Congrats.");
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
