package abstractfactory.impl;

import abstractfactory.Furniture;

public class Table implements Furniture {

    private String description;
    public Table(String description){
        this.description = description;
    }
    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
