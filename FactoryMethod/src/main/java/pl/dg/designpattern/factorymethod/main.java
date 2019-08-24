/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod;

import pl.dg.designpattern.factorymethod.game.ObstacleCreator;
import pl.dg.designpattern.factorymethod.game.SimpleObstacleCreator;
import pl.dg.designpattern.factorymethod.pc.Pc;
import pl.dg.designpattern.factorymethod.pc.cpu.CpuCreator;
import pl.dg.designpattern.factorymethod.pc.cpu.type.CpuType;
import pl.dg.designpattern.factorymethod.pc.mainboard.MainboardCreator;
import pl.dg.designpattern.factorymethod.pc.mainboard.type.MainboardType;

/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {
        ObstacleCreator oc = new SimpleObstacleCreator();
        System.out.println(oc.create("easy"));
        System.out.println(oc.create("hard"));
        //////////////////////////////////////
        CpuCreator cpuCreator = new CpuCreator();
        MainboardCreator mainboradCreator = new MainboardCreator();
        Pc personalComputer = new Pc(cpuCreator.createPart(CpuType.AMD), mainboradCreator.createPart(MainboardType.GIGABYTE));
        System.out.println(personalComputer);
    }
}
