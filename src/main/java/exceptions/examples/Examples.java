package exceptions.examples;

import exceptions.customexc.ExampleOfException;

public class Examples {
    public void enterWebsite(int age) throws ExampleOfException {
        if (age < 18) {
            throw new ExampleOfException("Your age is " + age +": You must be 18 years old to enter website.");
        }
    }

    public void yourName(String name) throws ExampleOfException {
        if (name == "Ben"){
            throw new ExampleOfException(name + " <- This name already exists, please enter another one.");
        }
    }
}
