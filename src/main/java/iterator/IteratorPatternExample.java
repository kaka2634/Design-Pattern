package iterator;

import iterator.impl.HandHeldInventory;

public class IteratorPatternExample {
    public static void main(String[] args) {
        Inventory i = new HandHeldInventory(new Item("left"), new Item("right"));
        //1. get Iterator
        InventoryIterator it = i.getIterator();

        //2. while loop check iterator
        while(!it.isDone()){
            //3. get current
            Item item = it.current();

            //Do something
            System.out.println(item.getName());

            //4. move next
            it.next();
        }
    }
}
