package exceptions.examples;

import exceptions.customexc.RuntimeExceptionEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAddName {
    ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "James", "Jane"));
    public void addName(String name) throws RuntimeExceptionEx {
        if(names.contains(name)) {
            throw new RuntimeExceptionEx(name + " already exists in name array.");
        } else {
            names.add(name);
        }
    }
}
