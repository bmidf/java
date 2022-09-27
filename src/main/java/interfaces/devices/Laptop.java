package interfaces.devices;

import interfaces.partsofdevices.ICamera;
import interfaces.partsofdevices.IKeyboard;
import interfaces.partsofdevices.IMouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Laptop implements IMouse, IKeyboard, ICamera {
    private static final Logger LOGGER = LogManager.getLogger((String.valueOf(Airpods.class)));
    int num;
    int mp;
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
            System.out.println("This device does not use mouse.");
        }
    }

    public void usesKeyboard() {
        LOGGER.info("This device uses keyboard.");
    }
    public void usesCamera() {
        LOGGER.info("This device uses mouse.");
    }
    public void cameraMP(int newMp) {
        mp = newMp;
        LOGGER.info("ICamera has " + mp + " MP");
    }
}
