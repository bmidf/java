package interfaces.devices;

import interfaces.partsofdevices.IKeyboard;
import interfaces.partsofdevices.IMouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Computer implements IMouse, IKeyboard {
    private static final Logger LOGGER = LogManager.getLogger((String.valueOf(Airpods.class)));
    int num;
    public void usesMouse() {
        LOGGER.info("This device uses mouse.");
    }
    public void connectedMouseCount(int newNum) {
        num = newNum;
        if(num > 1){
            LOGGER.info("This device uses " + num + " mice.");
        }else if(num == 1){
            LOGGER.info("This device uses " + num + " mouse.");
        }else{
            LOGGER.info("This device does not use mouse.");
        }
    }


    public void usesKeyboard() {
        LOGGER.info("This device uses keyboard.");
    }
}