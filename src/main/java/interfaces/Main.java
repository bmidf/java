package interfaces;

import interfaces.devices.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Main {
    private static final Logger LOGGER = LogManager.getLogger((String.valueOf(Main.class)));
    public static void main(String[] args) {
        LOGGER.info("Computer");
        Computer myObj = new Computer();
        myObj.usesMouse();
//        try {
//            myObj.connectedMouseCount(Integer.parseInt ("3"));
//            LOGGER.info("IllegalArgumentException");
//            throw new IllegalArgumentException("IllegalArgumentException");
//        } catch(NumberFormatException e) {
//            LOGGER.info("NumberFormatException");
//        }
        myObj.usesKeyboard();

        LOGGER.info("\nPhone");
        Phone myObj1 = new Phone();
        myObj1.usesCamera();
        myObj1.cameraMP(48);
        myObj1.usesWIFI();
        myObj1.wifiSpeed(20);
        myObj1.usesMicrophone();
        myObj1.enableMic();

        LOGGER.info("\nIpad");
        Ipad myObj2 = new Ipad();
        myObj2.usesCamera();
        myObj2.cameraMP(12);
        myObj2.usesWIFI();
        myObj2.wifiSpeed(19);
        myObj1.usesMicrophone();

        LOGGER.info("\nLaptop");
        Laptop myObj3 = new Laptop();
        myObj3.usesMouse();
        myObj3.connectedMouseCount(1);
        myObj3.usesKeyboard();
        myObj2.usesCamera();
        myObj2.cameraMP(8);

        LOGGER.info("\nEarpods");
        Airpods myObj4 = new Airpods();
        myObj4.usesBluetooth();
    }
}