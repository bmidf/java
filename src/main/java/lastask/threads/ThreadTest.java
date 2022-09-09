package lastask.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadTest extends Thread {
    private static final Logger logger = LogManager.getLogger(ThreadTest.class);
    public void run(){
        logger.info("Thread Started Running...");
    }
}
