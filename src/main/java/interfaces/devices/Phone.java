package interfaces.devices;

import interfaces.partsofdevices.ICamera;
import interfaces.partsofdevices.IMicrophone;
import interfaces.partsofdevices.IWIFI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Phone implements ICamera, IWIFI, IMicrophone {
    private static final Logger LOGGER = LogManager.getLogger((String.valueOf(Airpods.class)));
    int speed;
    int mp;
    public void usesMicrophone() {
        LOGGER.info("This device uses IMicrophone.");
    }

    public void enableMic(){
        LOGGER.info("IMicrophone is enabled.");
    }

    public void usesWIFI() {
        LOGGER.info("This device uses IWIFI.");
    }
    public void wifiSpeed(int newSpeed) {
        speed = newSpeed;
        LOGGER.info("Internet speed is " + speed + " MBPs");
    }
    public void usesCamera() {
        LOGGER.info("This device uses ICamera.");
    }
    public void cameraMP(int newMp) {
        mp = newMp;
        LOGGER.info("ICamera has " + mp + " MP");
    }
}