package patternt.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import patternt.decorator.models.NonVegFood;
import patternt.decorator.models.VegFood;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        VegFood vf = new VegFood();
        LOGGER.info(vf.foodPrice());
        LOGGER.info(vf.prepareFood());

        Food f1 = new NonVegFood((Food) new VegFood());
        LOGGER.info(f1.prepareFood());
        LOGGER.info(f1.foodPrice());
    }
}
