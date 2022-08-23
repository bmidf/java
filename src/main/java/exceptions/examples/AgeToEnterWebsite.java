package exceptions.examples;

import exceptions.customExc.ExampleOfException;

public class AgeToEnterWebsite {
    public void enterWebsite(int age) throws ExampleOfException {
        if (age < 18) {
            throw new ExampleOfException("Must be 18 years old to enter website.");
        }
    }
}
