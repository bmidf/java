package collections;

public class Generic <T, V> {
    T age;
    V name;
    public Generic(T age, V name) {
        this.age = age;
        this.name = name;
    }
    public void print(){
        System.out.println("You live at: " + this.age + " " + this.name);
    }
    public static void main(String[] args) {
        Generic<Integer, String> nick = new Generic<>(18, "Nick");
        nick.print();
    }

}


