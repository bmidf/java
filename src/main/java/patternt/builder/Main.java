package patternt.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
        private static final Logger LOGGER = LogManager.getLogger(Main.class);
        public static void main(String[] args){
            CDBuilder cdBuilder=new CDBuilder();
            CDType cdType1=cdBuilder.buildSonyCD();
            cdType1.showItems();
        }
}
