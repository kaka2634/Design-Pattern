package decorator.impl;

import decorator.AddonDecorator;
import decorator.Beverage;

public class CaramelDecorator implements AddonDecorator {
    //Has a ref to beverage, so that call the core
    Beverage beverage;
    public CaramelDecorator(Beverage b){
        this.beverage = b;
    }

    @Override
    public double cost() {
        //Add additional responsibility
        return this.beverage.cost() + 1;
    }
}
