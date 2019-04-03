package abstractfactory.impl;


import abstractfactory.Furniture;

public class Chair implements Furniture {

    private String description;

    public Chair(String description){
        this.description = description;
    }

    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
