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
public class RamDecorator extends AbstractProductDecorator {

    private final String model;
    private final double price;

    public RamDecorator(AbstractProduct product, String model, double price) {
        super(product);
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " ram: " + model + ", ";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + price;
    }
}
