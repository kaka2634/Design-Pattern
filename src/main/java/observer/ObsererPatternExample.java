package observer;

import observer.impl.PhoneDisplay;
import observer.impl.WeatherStation;

public class ObsererPatternExample {
    public static void main(String args[]){
        WeatherStation station = new WeatherStation();
        //Pass the station ref to phoneDisplay, so that phoneDisplay will get data once update() been called

        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        station.addObserver(phoneDisplay);
        station.setTemperature(3);
        station.setTemperature(5);
    }
}
