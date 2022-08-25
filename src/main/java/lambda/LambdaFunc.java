package lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.function.*;

public class LambdaFunc {
    private static final Logger logger = LogManager.getLogger((String.valueOf(LambdaFunc.class)));

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        //lambda function 1
        Consumer<Integer> out = (n) -> { logger.info("N= "+n); };
        num.forEach(out);
        //lambda function 2
        Function<Integer, Integer> mult = a -> a * 2;
        logger.info("Function 2: "+mult.apply(5));
        //lambda function 3
        Supplier<Double> randomValue = () -> Math.random();
        logger.info("Function 3: "+randomValue.get());
        //lambda function 4
        BooleanSupplier bool = () -> 5 < 50;
        logger.info("Function 4: "+bool.getAsBoolean());
        //lambda function 5
        IntToDoubleFunction itod = a -> 2.20 * a;
        logger.info("Function 5: "+itod.applyAsDouble(2));
        //generic function 1
        IValue<Double> refIValue = () -> 3.14;
        logger.info("Lambda Generic 1: "+refIValue.GetValue());
    }
}
