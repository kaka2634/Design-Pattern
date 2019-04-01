package factorymethod.impl;

import factorymethod.Furniture;
import factorymethod.FurnitureFactory;

public class ChineseFurnitureFactory implements FurnitureFactory {
    @Override
    public Furniture createChair() {
        Furniture furniture = new Chair("Chinese Chair");
        return furniture;
    }
}
