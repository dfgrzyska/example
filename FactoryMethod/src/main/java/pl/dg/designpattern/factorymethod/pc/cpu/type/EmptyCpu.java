/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc.cpu.type;

/**
 *
 * @author HP
 */
public class EmptyCpu implements Cpu {

    private final String description = "no cpu";
    private final double price = 0;
    private final String model = "none";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "EmptyCpu{" + "description=" + description + ", price=" + price + '}';
    }

    @Override
    public String getModel() {
        return model;
    }

}
