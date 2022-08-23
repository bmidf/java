package exceptions;

import exceptions.customExc.ExampleOfException;
import exceptions.examples.AgeToEnterWebsite;
import exceptions.examples.ArrayAddName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String args[]){
        //ExampleOfException "checked"
        AgeToEnterWebsite yourAge = new AgeToEnterWebsite();
        try{
            yourAge.enterWebsite(16);
        } catch (ExampleOfException ex){
            logger.info("Exception occurred: " + ex);
        }

        //RuntimeExceptionEx "unchecked"
        ArrayAddName nameEx = new ArrayAddName();
        nameEx.addName("Jake");
        nameEx.addName("John");

        //just an example of exception
        int a = 6;
        int b = 0;
        try {
            int num = Integer.parseInt ("Number") ;
            logger.info("" + num);
        } catch(NumberFormatException e) {
            logger.info("NumberFormatException");
        }

    }
}