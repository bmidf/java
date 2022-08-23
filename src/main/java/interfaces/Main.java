package interfaces;

import exceptions.Exceptions;
import interfaces.Devices.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Main {
    private static final Logger logger = LogManager.getLogger((String.valueOf(Main.class)));
    public static void main(String[] args) {
        logger.info("Computer");
        Computer myObj = new Computer();
        myObj.usesMouse();
//        try {
//            myObj.connectedMouseCount(Integer.parseInt ("3"));
//            logger.info("IllegalArgumentException");
//            throw new IllegalArgumentException("IllegalArgumentException");
//        } catch(NumberFormatException e) {
//            logger.info("NumberFormatException");
//        }
        myObj.usesKeyboard();

        logger.info("\nPhone");
        Phone myObj1 = new Phone();
        myObj1.usesCamera();
        myObj1.cameraMP(48);
        myObj1.usesWIFI();
        myObj1.wifiSpeed(20);
        myObj1.usesMicrophone();
        myObj1.enableMic();

        logger.info("\nIpad");
        Ipad myObj2 = new Ipad();
        myObj2.usesCamera();
        myObj2.cameraMP(12);
        myObj2.usesWIFI();
        myObj2.wifiSpeed(19);
        myObj1.usesMicrophone();

        logger.info("\nLaptop");
        Laptop myObj3 = new Laptop();
        myObj3.usesMouse();
        myObj3.connectedMouseCount(1);
        myObj3.usesKeyboard();
        myObj2.usesCamera();
        myObj2.cameraMP(8);

        logger.info("\nEarpods");
        Airpods myObj4 = new Airpods();
        myObj4.usesBluetooth();
    }
}