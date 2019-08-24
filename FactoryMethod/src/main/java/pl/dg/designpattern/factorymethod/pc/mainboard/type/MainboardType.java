/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc.mainboard.type;

import pl.dg.designpattern.factorymethod.pc.PartType;

/**
 *
 * @author HP
 */
public enum MainboardType implements PartType {
    MSI("gaming x500"),
    GIGABYTE("xzc-1220");
    String model;

    private MainboardType(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
