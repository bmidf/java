package interfaces.Devices;

import interfaces.PartsOfDevices.IKeyboard;
import interfaces.PartsOfDevices.IMouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Computer implements IMouse, IKeyboard {
    private static final Logger logger = LogManager.getLogger((String.valueOf(Airpods.class)));
    int num;
    public void usesMouse() {
        logger.info("This device uses mouse.");
    }
    public void connectedMouseCount(int newNum) {
        num = newNum;
        if(num > 1){
            logger.info("This device uses " + num + " mice.");
        }else if(num == 1){
            logger.info("This device uses " + num + " mouse.");
        }else{
            logger.info("This device does not use mouse.");
        }
    }


    public void usesKeyboard() {
        logger.info("This device uses keyboard.");
    }
}