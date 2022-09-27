package json;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.models.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONtoObject {
    private static final Logger LOGGER = LogManager.getLogger(JSONtoObject.class);
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper =new ObjectMapper();
            JavaType json = objectMapper.getTypeFactory().constructCollectionType(List.class, Customer.class);
            List<Customer> customers = objectMapper.readValue(new File("src/main/resources/json/JSONcustomer.json"),json);
            LOGGER.info(customers);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

