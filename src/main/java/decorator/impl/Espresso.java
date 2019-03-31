package decorator.impl;

import decorator.Beverage;

public class Espresso implements Beverage {
    @Override
    public double cost() {
        return 2;
    }
}
