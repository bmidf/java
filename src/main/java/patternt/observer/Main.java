package patternt.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        LOGGER.info("First state change: 15");
        subject.setState(15);
        LOGGER.info("Second state change: 10");
        subject.setState(10);
    }
}

