/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.observer.weatherstation;

import java.util.ArrayList;
import java.util.List;
import pl.dg.designpattern.observer.display.ISubscriber;

/**
 *
 * @author HP
 */
public class WeatherStation implements IObserverable, IWeatherStation {

    List<ISubscriber> subscribers = new ArrayList();
    private double temperature;
    private String pressure = "";

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update());
    }

    @Override
    public void register(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void remove(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getPressure() {
        return pressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifySubscribers();
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

}
