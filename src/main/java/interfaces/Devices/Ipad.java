package interfaces.Devices;

import interfaces.PartsOfDevices.ICamera;
import interfaces.PartsOfDevices.IMicrophone;
import interfaces.PartsOfDevices.IWIFI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ipad implements ICamera, IWIFI, IMicrophone {
    private static final Logger logger = LogManager.getLogger((String.valueOf(Airpods.class)));
    int speed;
    int mp;
    public void usesMicrophone() {
        logger.info("This device uses IMicrophone.");
    }
    public void enableMic(){
        logger.info("IMicrophone is enabled.");
    }
    public void usesWIFI() {
        logger.info("This device uses IWIFI.");
    }

    public void wifiSpeed(int newSpeed) {
        speed = newSpeed;
        logger.info("Internet speed is " + speed + " MBPs");
    }
    public void usesCamera() {
        logger.info("This device uses mouse.");
    }
    public void cameraMP(int newMp) {
        mp = newMp;
        logger.info("ICamera has " + mp + " MP");
    }
}

