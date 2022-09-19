package jaxb;

import java.io.File;

import enums.Main;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XMLtoObject {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        try {
            JAXBContext jaxb = JAXBContext.newInstance(Customer.class);
            Unmarshaller unmarshall = jaxb.createUnmarshaller();
            Customer customer = (Customer) unmarshall.unmarshal(new File("src/main/resources/customer.xml"));
                LOGGER.info(customer);
                LOGGER.info("[Customer Id : " + customer.getId()+"Customer Age : "
                        + customer.getAge()+"Customer Name : " + customer.getName()+"]");
//                LOGGER.info("Customer Age : " + customer.getAge());
//                LOGGER.info("Customer Name : " + customer.getName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
