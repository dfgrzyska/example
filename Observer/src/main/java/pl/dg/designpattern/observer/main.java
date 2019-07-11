/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.observer;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import pl.dg.designpattern.observer.display.ISubscriber;
import pl.dg.designpattern.observer.display.PhoneDisplay;
import pl.dg.designpattern.observer.display.TvDisplay;
import pl.dg.designpattern.observer.weatherstation.WeatherStation;

/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        ISubscriber phoneDisplay = new PhoneDisplay(weatherStation);
        ISubscriber tvDisplay = new TvDisplay(weatherStation);
        weatherStation.register(phoneDisplay);
        weatherStation.register(tvDisplay);

        int delay = 0;
        for (int i = 0; i < 5; i++) {
            delay = (1 + new Random().nextInt(35));
            ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
            scheduler.schedule(() -> {
                weatherStation.setTemperature(1 + new Random().nextInt(35));
            }, delay, TimeUnit.SECONDS);
        }
    }
}
