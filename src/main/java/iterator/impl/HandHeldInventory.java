package iterator.impl;

import iterator.Inventory;
import iterator.InventoryIterator;
import iterator.Item;

public class HandHeldInventory implements Inventory {
    private Item right;
    private Item left;

    public HandHeldInventory(Item left, Item right) {
        this.right = right;
        this.left = left;
    }

    public Item getRight() {
        return right;
    }

    public void setRight(Item right) {
        this.right = right;
    }

    public Item getLeft() {
        return left;
    }

    public void setLeft(Item left) {
        this.left = left;
    }

    @Override
    public InventoryIterator getIterator() {
        //Key point to get Iterator, also pass this to iterator
        return new HandHeldInventoryIterator(this);
    }


}
