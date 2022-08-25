package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Generic <T, V> {
    private static final Logger logger = LogManager.getLogger(Generic.class);
    T age;
    V name;
    public Generic(T age, V name) {
        this.age = age;
        this.name = name;
    }
    public void print(){
        logger.info("Age: " + this.age + ", " + "Name: " + this.name);
    }

}


