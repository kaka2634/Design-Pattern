package adapter;

import adapter.Impl.Adaptee;
import adapter.Impl.Adapter;

public class AdapterPatterExample {
    public static void main(String args[]){
        ITarget iTarget = new Adapter(new Adaptee());
        //Common interface
        iTarget.request();
    }
}
