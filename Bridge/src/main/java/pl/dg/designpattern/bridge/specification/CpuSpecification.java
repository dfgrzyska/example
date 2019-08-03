/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.bridge.specification;

import pl.dg.designpattern.bridge.part.Cpu;

/**
 *
 * @author HP
 */
public class CpuSpecification implements Specification {

    private final Cpu cpu;

    public CpuSpecification(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String getProducer() {
        return this.cpu.getManufacturer();
    }

    @Override
    public String getDescription() {
        return getSnippet() + " " + this.cpu.getSocket() + " " + this.cpu.getCores();
    }

    @Override
    public String getSnippet() {
        return this.cpu.getManufacturer() + " " + this.cpu.getModel();
    }

}
