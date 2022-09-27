package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.models.Customer;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ObjectToJSON {
    public static List<Customer> getCustomer() {
        return List.of(
                new Customer(1, "Jason", 34),
                new Customer(2, "Jack",  31),
                new Customer(3, "Jordan",  22)
        );
    }
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/json/JSONCustomersWrite.json"),getCustomer());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}