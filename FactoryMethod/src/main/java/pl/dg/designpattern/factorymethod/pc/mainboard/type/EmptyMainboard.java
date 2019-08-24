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
public class EmptyMainboard implements Mainboard {

    String description = "No mainboard";
    double price = 0;
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
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "GigabyteMainboard{" + "description=" + description + ", price=" + price + '}';
    }
}
