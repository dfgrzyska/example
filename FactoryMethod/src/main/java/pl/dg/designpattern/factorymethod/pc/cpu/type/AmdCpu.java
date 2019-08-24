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
public class AmdCpu implements Cpu {

    private final String descritpion = "8 cores, 32MB cache, 3.6GHz";
    private final double price = 1400;
    private final String model;

    public AmdCpu(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return descritpion;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "AmdCpu{" + "descritpion=" + descritpion + ", price=" + price + ", model=" + model + '}';
    }

    @Override
    public String getModel() {
        return model;
    }

}
