/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc.mainboard.type;

/**
 *
 * @author HP
 */
public class GigabyteMainboard implements Mainboard {

    String description = "3xpcie,4 x RAM slots dual channel, DDR4";
    double price = 999;
    private final String model;

    public GigabyteMainboard(String model) {
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
        return "GigabyteMainboard{" + "description=" + description + ", price=" + price + ", model=" + model + '}';
    }

}
