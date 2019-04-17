package iterator.impl;

import iterator.InventoryIterator;
import iterator.Item;

public class HandHeldInventoryIterator implements InventoryIterator {
    //Keep a reference to Collection
    private HandHeldInventory inventory;

    public HandHeldInventoryIterator(HandHeldInventory inventory) {
        this.inventory = inventory;
        this.index = 0;
    }

    private int index;

    @Override
    public boolean isDone() {
        if(this.index < 2)
            return false;
        return true;
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public Item current() {
        if(index == 0) return this.inventory.getLeft();
        else if(index == 1) return  this.inventory.getRight();

        //May need to change to Null Iterator object
        return null;
    }
}
