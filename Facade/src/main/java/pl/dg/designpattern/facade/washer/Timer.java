/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.facade.washer;

/**
 *
 * @author HP
 */
public class Timer {

    private final int minutes;

    public Timer(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

}
