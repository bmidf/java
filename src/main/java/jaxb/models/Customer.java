package jaxb.models;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "customer")
public class Customer {
    private int id;
    private String name;
    private int age;
    @XmlAttribute(name="id")
    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }
    @XmlElement(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name="age")
    public int getAge() {return age;}
    public void setAge(int age) {
        this.age = age;
    }
}