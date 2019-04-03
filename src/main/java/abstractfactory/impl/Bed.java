package abstractfactory.impl;

import abstractfactory.Furniture;

public class Bed implements Furniture {

    private String description;
    public Bed(String description){
        this.description = description;
    }
    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
