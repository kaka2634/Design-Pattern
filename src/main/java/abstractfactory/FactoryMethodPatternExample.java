package abstractfactory;


import abstractfactory.impl.ConcreteFurnitureFactory;

public class FactoryMethodPatternExample {
    public static void main(String args[]) {

        //Factory Method pattern construct single object in different way ( One factory or different factory, but key should only be one product with different created ways)
        //Abstract Factory pattern construct multiple object (One product type or different product type, one factory or different factory, but key is that should be a series of product)
        FurnitureFactory factory = new ConcreteFurnitureFactory();
        factory.createTable().showDescription();
        factory.createBed().showDescription();
        factory.createChair().showDescription();

    }
}
