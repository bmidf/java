package patternt.facade.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import patternt.facade.Phone;

public class Samsung implements Phone {
    private static final Logger LOGGER = LogManager.getLogger(Samsung.class);
    @Override
    public void modelNo() {
        LOGGER.info(" Samsung Galaxy S20");
    }
    @Override
    public void price() {
        LOGGER.info(" 800$\n");
    }
}
