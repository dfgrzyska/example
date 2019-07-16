/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc.cpu.type;

import pl.dg.designpattern.factorymethod.pc.PartType;

/**
 *
 * @author HP
 */
public enum CpuType implements PartType {
    AMD("Ryzen 3700X"),
    Intel("I9-9900K");
    String model;

    private CpuType(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
