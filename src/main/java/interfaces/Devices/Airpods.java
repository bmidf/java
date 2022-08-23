package interfaces.Devices;

import interfaces.PartsOfDevices.IBluetooth;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Airpods implements IBluetooth {
    private static final Logger logger = LogManager.getLogger((String.valueOf(Airpods.class)));
    public void usesBluetooth() {
        logger.info("This device uses Bluetooth.");
    }
}
