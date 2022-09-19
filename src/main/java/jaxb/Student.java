package jaxb;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "student")
public class Student {
    private String name;
    private String degree;
    private String marks;
    @XmlElement(name = "name")
    public String getFullName() {return name;}
    public void setName(String name) {
        name = name;
    }
    @XmlElement(name = "degree")
    public String getDegree() {return degree;}
    public void setDegree(String degree) {
        degree = degree;
    }
    @XmlElement(name = "marks")
    public String getMarks() {return marks;}
    public void setMarks(String marks) {
        marks = marks;
    }
}