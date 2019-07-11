/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.observer.display;

import pl.dg.designpattern.observer.weatherstation.WeatherStation;

/**
 *
 * @author HP
 */
public class PhoneDisplay implements IDisplay, ISubscriber {

    private final WeatherStation weatherStation;
    private double temperature;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        print();
    }

    @Override
    public void print() {
        System.out.println("Phone display \n Temparature: " + temperature);
    }

}
