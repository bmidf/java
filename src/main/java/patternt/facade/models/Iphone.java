package patternt.facade.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import patternt.facade.Phone;

public class Iphone implements Phone {
    private static final Logger LOGGER = LogManager.getLogger(Iphone.class);
    @Override
    public void modelNo() {
        LOGGER.info(" Iphone 11");
    }
    @Override
    public void price() {
        LOGGER.info(" 1000$\n");
    }
}