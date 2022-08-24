package collections;

public class School {
    private int id;
    private String name;
    private Double marks;
    School(int id, String name, Double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return  this.id + " " + this.name + " " + this.marks;
    }
}
