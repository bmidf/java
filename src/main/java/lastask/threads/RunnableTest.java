package lastask.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnableTest implements Runnable {
    private static final Logger logger = LogManager.getLogger(RunnableTest.class);
    public void run(){
        logger.info("Runnable thread is running... ");
    }
}
