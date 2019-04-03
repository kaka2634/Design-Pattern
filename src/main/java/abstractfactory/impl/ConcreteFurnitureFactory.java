package abstractfactory.impl;


import abstractfactory.Furniture;
import abstractfactory.FurnitureFactory;

public class ConcreteFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture createChair() {
        return new Chair("Chair");
    }

    @Override
    public Furniture createTable() {
        return new Table("Table");
    }

    @Override
    public Furniture createBed() {
        return new Bed("Bed");
    }
}
