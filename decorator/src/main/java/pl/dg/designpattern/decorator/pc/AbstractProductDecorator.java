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
public abstract class AbstractProductDecorator extends AbstractProduct {

    protected AbstractProduct product;

    public AbstractProductDecorator(AbstractProduct product) {
        this.product = product;
    }

    @Override
    public abstract String getDescription();

}
