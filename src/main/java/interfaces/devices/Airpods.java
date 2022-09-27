package interfaces.devices;

import interfaces.partsofdevices.IBluetooth;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Airpods implements IBluetooth {
    private static final Logger LOGGER = LogManager.getLogger((String.valueOf(Airpods.class)));
    public void usesBluetooth() {
        LOGGER.info("This device uses Bluetooth.");
    }
}
