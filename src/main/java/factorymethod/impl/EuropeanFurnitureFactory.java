package factorymethod.impl;

import factorymethod.Furniture;
import factorymethod.FurnitureFactory;

public class EuropeanFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture createChair() {
        Furniture furniture = new Chair("European Chair");
        return furniture;
    }
}
