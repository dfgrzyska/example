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
public class TvDisplay implements IDisplay, ISubscriber {

    private double temperature;
    private final WeatherStation weatherStation;

    public TvDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void print() {
        System.out.println("BIIIG tv display: \n Temperature:" + temperature);
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        print();
    }

}
