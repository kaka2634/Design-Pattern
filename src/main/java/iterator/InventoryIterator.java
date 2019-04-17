package iterator;

public interface InventoryIterator {
    boolean isDone();
    void next();
    Item current();
}
