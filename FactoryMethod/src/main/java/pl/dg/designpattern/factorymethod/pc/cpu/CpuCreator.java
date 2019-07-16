/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc.cpu;

import pl.dg.designpattern.factorymethod.pc.cpu.type.CpuType;
import pl.dg.designpattern.factorymethod.pc.PartCreator;
import pl.dg.designpattern.factorymethod.pc.cpu.type.AmdCpu;
import pl.dg.designpattern.factorymethod.pc.cpu.type.Cpu;
import pl.dg.designpattern.factorymethod.pc.cpu.type.EmptyCpu;
import pl.dg.designpattern.factorymethod.pc.cpu.type.IntelCpu;

/**
 *
 * @author HP
 */
public class CpuCreator implements PartCreator<CpuType> {

    @Override
    public Cpu createPart(CpuType partType) {
        switch (partType) {
            case AMD:
                return new IntelCpu(partType.getModel());
            case Intel:
                return new AmdCpu(partType.getModel());
            default:
                return new EmptyCpu();
        }
    }

}
