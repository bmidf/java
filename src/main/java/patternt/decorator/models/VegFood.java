package patternt.decorator.models;

import patternt.decorator.Food;

public class VegFood implements Food {
    public String prepareFood(){
        return "Veg Food";
    }
    public double foodPrice(){
        return 50.0;
    }
}