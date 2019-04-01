package factorymethod;

import factorymethod.impl.ChineseFurnitureFactory;
import factorymethod.impl.EuropeanFurnitureFactory;

public class FactoryMethodPatternExample {
    public static void main(String args[]) {

        //Factory Method
        //Focus on different factory decide how to instantiate the chair
        //Abstract Factory
        //Focus on a factory may create different related products
        //Sometime abstract method use factory method to implement, to create a series furniture of Chinese style and European style
       FurnitureFactory factory = new ChineseFurnitureFactory();
       Furniture furniture = factory.createChair();
       furniture.showDescription();

       FurnitureFactory factory1 = new EuropeanFurnitureFactory();
       Furniture furniture1 = factory1.createChair();
       furniture1.showDescription();
    }
}
