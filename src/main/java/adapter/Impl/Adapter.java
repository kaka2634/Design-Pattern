package adapter.Impl;

import adapter.ITarget;

public class Adapter implements ITarget {
    //Composite Way
    Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
