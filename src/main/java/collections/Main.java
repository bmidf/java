package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        School s1 = new School(1,"John",  9.40);
        School s2 = new School(2,"James",  7.20);
        School s3 = new School(3,"June", 9.10);

        LinkedList<School> studentList = new LinkedList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        logger.info("Student List: " + studentList);
        logger.info("========================================");
        studentList.remove(s1);
        logger.info("New Student List: " + studentList);

        logger.info("==================Generic======================");

        logger.info("Person:");
        Generic<Integer, String> nick = new Generic<>(18, "Nick");
        nick.print();
        logger.info("Street:");
        Address<Integer, String> street = new Address<>(54339839, "Freedom Ave.");
        street.print();


         /*
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Rabbit");
        animals.add("Cat");
        animals.add("Horse");
        animals.add(1, "Dog");
        logger.info("Animal list: " + animals);

        String firstAnimal = animals.get(1);
        logger.info("First animal in list: " + firstAnimal);

        animals.set(2, "Wolf");
        animals.remove(3);
        animals.addLast("Bear");
        logger.info("Updated animal list: " + animals);
        */
    }

}
