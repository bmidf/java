package readtext;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args){

        File read = new File("src/main/resources/file.txt");
        try{
            String write = FileUtils.readFileToString(read, StandardCharsets.UTF_8);
            logger.info(write);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}