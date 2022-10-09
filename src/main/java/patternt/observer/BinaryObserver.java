package patternt.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BinaryObserver extends Observer{
    private static final Logger LOGGER = LogManager.getLogger(BinaryObserver.class);
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        LOGGER.info("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}