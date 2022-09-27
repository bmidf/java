package json.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(int id, String name,  int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Customer " + id + " {"+
                "\nid = " + id +
                "\nname = " + name +
                "\nage = " + age +
                "\n}";
    }
}
