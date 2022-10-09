package collections;

public class School {
    private int id;
    private String name;
    private Double marks;

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

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    School(int id, String name, Double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return  this.id + " " + this.name + " " + this.marks;
    }
}
