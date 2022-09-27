package lastask.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(RunnableStop.class);
    public static void main(String args[]){
        RunnableTest r1 = new RunnableTest();
        Thread th1 = new Thread(r1, "Runnable Thread");
        th1.start();
        LOGGER.info(th1.getName());

        ThreadTest g1 = new ThreadTest();
        g1.start();
        LOGGER.info("New Thread name: " + g1.getName());

        RunnableStop stop = new RunnableStop();
        Thread thread = new Thread(stop);
        thread.start();
        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop.doStop();
    }
}