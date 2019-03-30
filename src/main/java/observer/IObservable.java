package observer;

public interface IObservable {
    void addObserver(IObserver o);
    void removeObsever(IObserver o);
    //Cannot use notify() because Object has notify() method
    void notifyObserver();
}
