//package collections;
//
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//
//import java.util.*;
//
//class Collections {
//    private int number;
//    private String name;
//    private Double marks;
//    Collections(int number, String name, Double marks){
//        this.number = number;
//        this.name = name;
//        this.marks = marks;
//    }
//    public String toString(){
//        return  this.number + " " + this.name + " " + this.marks;
//    }
//    private static final Logger logger = LogManager.getLogger((String.valueOf(Collections.class)));
//
//    public static void main(String[] args){
//        PropertyConfigurator.configure("log4j.properties");
//        Collections s1 = new Collections(555,"John",  9.40);
//        Collections s2 = new Collections(557,"James",  7.20);
//        Collections s3 = new Collections(593,"June", 9.10);
//
//        ArrayList<Collections> studentList = new ArrayList<>();
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//
//        HashSet<Collections> studentSet = new HashSet<>();
//        studentSet.add(s1);
//        studentSet.add(s2);
//        studentSet.add(s3);
//
//        logger.info("Student List: " + studentList);
//        logger.info("Student Set: " + studentSet);
//
//         /*
//        LinkedList<String> animals = new LinkedList<>();
//        animals.add("Rabbit");
//        animals.add("Cat");
//        animals.add("Horse");
//        animals.add(1, "Dog");
//        logger.info("Animal list: " + animals);
//
//        String firstAnimal = animals.get(1);
//        logger.info("First animal in list: " + firstAnimal);
//
//        animals.set(2, "Wolf");
//        animals.remove(3);
//        animals.addLast("Bear");
//        logger.info("Updated animal list: " + animals);
//
//        ArrayDeque<Integer> Deque = new ArrayDeque<Integer>(10);
//
//        Deque.add(2);
//        Deque.add(49);
//        Deque.add(99);
//        logger.info("Array Deque"+Deque);
//
//        Deque.addFirst(1);
//        Deque.addLast(100);
//        logger.info("Array Deque"+Deque);
//        */
//    }
//}
