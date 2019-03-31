package decorator;

import decorator.impl.CaramelDecorator;
import decorator.impl.Espresso;
import decorator.impl.SoyDecorator;

public class DecoratorPatternExample {
    public static void main(String args[]){
        Beverage b = new SoyDecorator(new CaramelDecorator(new Espresso()));
        System.out.println("Espresso with caramel and soy cost: " + b.cost());
    }
}
