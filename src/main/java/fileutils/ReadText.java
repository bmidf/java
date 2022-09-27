package fileutils;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class ReadText {
    private static final Logger LOGGER = LogManager.getLogger(ReadText.class);
    public static void main(String[] args){

        Map<String, Integer> uniqueWords = new HashMap<>();

        File read = new File("src/main/resources/file.txt");

        try{
            String write = FileUtils.readFileToString(read, StandardCharsets.UTF_8);

            String[] writeUnique = FileUtils.readFileToString(read,StandardCharsets.UTF_8).split("\\s+");

            for (String w : writeUnique) {
                if (uniqueWords.containsKey(w)) {
                    uniqueWords.put(w, uniqueWords.get(w) + 1);
                } else {
                    uniqueWords.put(w, 1);
                }
            }

            LOGGER.info("Text From File: " + write);
            LOGGER.info("Number of Unique Words in File: " + uniqueWords.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}