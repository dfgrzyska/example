/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.decorator.pc;

/**
 *
 * @author HP
 */
public abstract class AbstractProduct {

    protected String description;
    protected double price;

    public abstract double getPrice();

    public String getDescription() {
        return description;
    }
}
