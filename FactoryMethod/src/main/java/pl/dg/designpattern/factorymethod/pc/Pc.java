/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc;

import pl.dg.designpattern.factorymethod.pc.cpu.type.Cpu;
import pl.dg.designpattern.factorymethod.pc.mainboard.type.Mainboard;

/**
 *
 * @author HP
 */
public class Pc {

    private final Cpu cpu;
    private final Mainboard motherboard;

    public Pc(Cpu cpu, Mainboard motherboard) {
        this.cpu = cpu;
        this.motherboard = motherboard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Mainboard getMotherboard() {
        return motherboard;
    }

    @Override
    public String toString() {
        return "Pc{" + "cpu=" + cpu + ", motherboard=" + motherboard + '}';
    }

}
