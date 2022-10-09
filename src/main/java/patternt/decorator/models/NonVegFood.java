package patternt.decorator.models;

import patternt.decorator.Food;
import patternt.decorator.FoodDecorator;

public class NonVegFood extends FoodDecorator {
    public NonVegFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +" With Roasted Chicken and Chicken Curry  ";
    }
    public double foodPrice()   {
        return super.foodPrice() + 150.0;
    }
}
