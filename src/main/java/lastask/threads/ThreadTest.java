package lastask.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadTest extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(ThreadTest.class);
    public void run(){
        LOGGER.info("Thread Started Running...");
    }
}
