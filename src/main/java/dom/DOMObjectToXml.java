package dom;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOMObjectToXml {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("customers");
            doc.appendChild(rootElement);

            // supercars element
            Element customer = doc.createElement("customer");
            rootElement.appendChild(customer);

            // setting attribute to element
            Attr attr = doc.createAttribute("company");
            attr.setValue("Amazon");
            customer.setAttributeNode(attr);

            // customerName element
            Element customerName = doc.createElement("customerName");
            customerName.appendChild(doc.createTextNode("David"));
            customer.appendChild(customerName);

            // customerName1 element
            Element customerName1 = doc.createElement("customerName");
            customerName1.appendChild(doc.createTextNode("Sergio"));
            customer.appendChild(customerName1);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/main/resources/dom/DOMCustomersWrite.xml"));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
