package factorymethod;


//Factory Method base on using different concreteFactory to instantiate product in different way
//Abstract Factory base on create a serial related products
//Abstract Factory sometimes implements by Factory Method
public interface FurnitureFactory {
    Furniture createChair();
}
