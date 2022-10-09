package patternt.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger((String.valueOf(Main.class)));
    public static void main(String[] args) {
        Phone samsung = PhoneFactory.getPhone("samsung","128 GB",6,"19:9");
        LOGGER.info("Samsung Factory: "+samsung);
    }
}