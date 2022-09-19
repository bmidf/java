package jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class ObjectToXML {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Becca");
        student.setDegree("Bachelor");
        student.setMarks("10/10");

        try {
            JAXBContext jaxb = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = jaxb.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File xmlFile = new File("src/main/resources/file.xml");
            marshaller.marshal(student, xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
