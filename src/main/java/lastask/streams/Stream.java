package lastask.streams;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import static java.util.stream.Collectors.*;

class Stream{
    private static final Logger LOGGER = LogManager.getLogger(Stream.class);
    public static void main(String args[]){
        List<String> strings = Arrays.asList("Mercury","Earth","Mars");

        //filter
        List<String> ends = strings.stream()
                .filter(s->s.endsWith("s"))
                .collect(toList());
        LOGGER.info("Planets that end with S: "+ends);
        //toUpperCase
        List<String> upper = strings.stream()
                .map(value -> value.toUpperCase())
                .collect(toList());
        LOGGER.info("Planets in upper case: " + upper);
        //joining
        String join = strings.stream()
                .collect(joining(" ", " ", " are Planets."));
        LOGGER.info(join);
        LOGGER.info("================================");
        List<Integer> numbers = Arrays.asList(9,12,44,64,6);
        //minimum
        Integer min = numbers.stream()
                .min(Integer::compare).get();
        LOGGER.info("Smallest number in list: "+min);
        //numbers divided to 2
        List<Integer> division2 = numbers.stream()
                .map(x -> x/2)
                .collect(toList());
        LOGGER.info("All numbers divided to 2: "+division2);
        //toSet
        Set<Integer> sameButToSet = numbers.stream()
                .map(x->x/2)
                .collect(toSet());
        LOGGER.info("All numbers divided to 2: "+sameButToSet);
        //counting numbers
        Long amount = numbers.stream()
                .collect(counting());
        LOGGER.info("Total numbers: "+amount);
        //getAsDouble,mapToInt,average
        Double average = numbers.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .average()
                .getAsDouble();
        LOGGER.info("Average number: " + average);
    }
}