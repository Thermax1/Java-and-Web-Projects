import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DomParserSchema {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); //DBFactory allows us to parse DOM object trees from XML documents
            DocumentBuilder builder = factory.newDocumentBuilder(); //Will allow XML to be parsed using various input methods (file in our case)

            Document document = builder.parse(new File("videogames.xml")); //Parses xml file and creates a document

            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); //calls the same URl as I put in videogames.xsd
            Schema schema = schemaFactory.newSchema(new File("videogames.xsd"));
            Validator validator = schema.newValidator();
            validator.validate(new javax.xml.transform.dom.DOMSource(document)); //counts how many errors. 0 errors = schema is validated. Other wise, we catch the error

            System.out.println("Your XML document has been validated with the XML schema. Congrats");
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e); //Will throw errors up if validation isn't successful
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
