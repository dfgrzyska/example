/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc.mainboard;

import pl.dg.designpattern.factorymethod.pc.mainboard.type.MainboardType;
import pl.dg.designpattern.factorymethod.pc.PartCreator;
import pl.dg.designpattern.factorymethod.pc.mainboard.type.EmptyMainboard;
import pl.dg.designpattern.factorymethod.pc.mainboard.type.GigabyteMainboard;
import pl.dg.designpattern.factorymethod.pc.mainboard.type.Mainboard;
import pl.dg.designpattern.factorymethod.pc.mainboard.type.MsiMainboard;

/**
 *
 * @author HP
 */
public class MainboardCreator implements PartCreator<MainboardType> {

    @Override
    public Mainboard createPart(MainboardType partType) {
        switch (partType) {
            case MSI:
                return new MsiMainboard(partType.getModel());
            case GIGABYTE:
                return new GigabyteMainboard(partType.getModel());
            default:
                return new EmptyMainboard();
        }
    }
}
