/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.observer.weatherstation;

import pl.dg.designpattern.observer.display.ISubscriber;

/**
 *
 * @author HP
 */
public interface IObserverable {

    void notifySubscribers();

    void register(ISubscriber subscriber);

    void remove(ISubscriber subscriber);
}
