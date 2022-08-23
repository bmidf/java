package exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Exceptions {
    private static final Logger logger = LogManager.getLogger(Exceptions.class);
    static void enterWebsite(int age) throws AgeToEnterWebsite {
        if (age < 18) {
            throw new AgeToEnterWebsite("Must be 18 years old to enter website.");
        } else {
            logger.info("Accepted");
        }
    }
    public static void main(String args[]){
        try{
            enterWebsite(13);
        }
        catch (AgeToEnterWebsite ex){
            logger.info("Caught the exception");
            logger.info("Exception occurred: " + ex);
        }
        logger.info("rest of the code...");
    }
}  