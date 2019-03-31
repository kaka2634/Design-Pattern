package decorator.impl;

import decorator.AddonDecorator;
import decorator.Beverage;

public class SoyDecorator implements AddonDecorator {
    //Has a ref to beverage, so that call the core
    Beverage beverage;
    public SoyDecorator(Beverage b){
        this.beverage = b;
    }

    @Override
    public double cost() {
        //Add additional responsibility
        return this.beverage.cost() + 1;
    }
}
