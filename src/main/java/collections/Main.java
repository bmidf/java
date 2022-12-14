package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args){
        School s1 = new School(1,"John",  9.40);
        School s2 = new School(2,"James",  7.20);
        School s3 = new School(3,"June", 9.10);

        LinkedList<School> studentList = new LinkedList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        LOGGER.info("Student List: " + studentList);
        LOGGER.info("========================================");
        studentList.remove(s1);
        LOGGER.info("New Student List: " + studentList);

        LOGGER.info("==================Generic======================");

        LOGGER.info("Person:");
        Generic<Integer, String> nick = new Generic<>(18, "Nick");
        nick.print();
        LOGGER.info("Street:");
        Address<Integer, String> street = new Address<>(54339839, "Freedom Ave.");
        street.print();


         /*
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Rabbit");
        animals.add("Cat");
        animals.add("Horse");
        animals.add(1, "Dog");
        LOGGER.info("Animal list: " + animals);

        String firstAnimal = animals.get(1);
        LOGGER.info("First animal in list: " + firstAnimal);

        animals.set(2, "Wolf");
        animals.remove(3);
        animals.addLast("Bear");
        LOGGER.info("Updated animal list: " + animals);
        */
    }

}
