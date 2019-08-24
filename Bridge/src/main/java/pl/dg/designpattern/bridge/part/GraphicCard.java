/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.bridge.part;

/**
 *
 * @author HP
 */
public class GraphicCard {

    private final String model;
    private final String manufacturer;
    private final String memory;
    private final double length;

    public GraphicCard(String model, String manufacturer, String memory, double length) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.length = length;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getMemory() {
        return memory;
    }

    public double getLength() {
        return length;
    }

}
