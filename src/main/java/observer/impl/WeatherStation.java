package observer.impl;

import observer.IObservable;
import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    //List of Observer
    private List<IObserver> observers = new ArrayList<>();
    private float temperature;

    //Register Observer
    @Override
    public void addObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObsever(IObserver o) {
        observers.remove(o);
    }


    //Heart of Oberserver Pattern
    @Override
    public void notifyObserver() {
        for(IObserver o : observers){
            o.update();
        }
    }

    public float getTemperature(){
        return this.temperature;
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        //notify Observer once data been changed
        notifyObserver();
    }
}
