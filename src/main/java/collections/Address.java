package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Address <I, N>{
    private static final Logger logger = LogManager.getLogger(Main.class);
    I streetId;
    N streetName;
    Address(I streetId, N streetName){
        this.streetId = streetId;
        this.streetName = streetName;
    }
    public void print(){
        logger.info("Street id: " + this.streetId + ", " + "Street Name: " + this.streetName);
    }

}
