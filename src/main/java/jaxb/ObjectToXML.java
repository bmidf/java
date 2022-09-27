package jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jaxb.models.Customer;

import java.io.File;

public class ObjectToXML {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Becca");
        customer.setId(1);
        customer.setAge(20);

        try {
            JAXBContext jaxb = JAXBContext.newInstance(Customer.class);
            Marshaller marshaller = jaxb.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File xmlFile = new File("src/main/resources/jaxb/JAXBCustomersWrite.xml");
            marshaller.marshal(customer, xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
