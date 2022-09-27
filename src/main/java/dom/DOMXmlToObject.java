package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.File;

public class DOMXmlToObject {
    private static final Logger LOGGER = LogManager.getLogger(DOMXmlToObject.class);
    public static void main(String[] argv) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/resources/DOMcustomer.xml"));
            doc.getDocumentElement().normalize();
            LOGGER.info("Root element: "+ doc.getDocumentElement().getNodeName());

            Node first = doc.getElementsByTagName("customer").item(0);
            NodeList nodeList = first.getChildNodes();
            for (int i=0; i<nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    LOGGER.info(node.getNodeName() + ": " + node.getTextContent());
                }
            }
        } catch (Exception e) {
            LOGGER.info(e);
        }
    }
}
