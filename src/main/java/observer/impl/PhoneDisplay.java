package observer.impl;

import observer.IDisplay;
import observer.IObservable;
import observer.IObserver;

public class PhoneDisplay implements IObserver, IDisplay {
    //Keep a ref to obserable so that obersever can get data after update() been called
    WeatherStation station;

    //Construct Dependency Injection
    public PhoneDisplay(WeatherStation station){
        this.station = station;
    }

    @Override
    public void display() {
        System.out.println(station.getTemperature());
    }

    //Push-Poll Structure -> update has no argument, so it need a ref to ConcreteObrservable (better solution, decouple the Observer)
    //Other solution: Push-Push Structure -> update will be passed the data which Observer interested
    @Override
    public void update() {
        display();
    }
}
