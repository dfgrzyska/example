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
public class IntelCpu implements Cpu {

    private final String description = "8 cores, 16mb cache, 3.6GHz";
    private final double price = 1400;
    private final String model;

    public IntelCpu(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "IntelCpu{" + "description=" + description + ", price=" + price + ", model=" + model + '}';
    }

}
