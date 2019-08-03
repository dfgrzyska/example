/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.command;

/**
 *
 * @author HP
 */
public class Receiver {

    private double value = 2;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        System.out.println("Current value: " + value);
    }
}
