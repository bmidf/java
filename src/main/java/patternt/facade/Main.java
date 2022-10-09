package patternt.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String args[]) throws NumberFormatException, IOException{
        LOGGER.info("Items in Shop: ");
        Shop sk = new Shop();
        sk.iphoneSale();
        sk.samsungSale();
    }
}