/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.facade;

import java.util.ArrayList;
import java.util.List;
import pl.dg.designpattern.facade.cloth.Cloth;
import pl.dg.designpattern.facade.cloth.ClothColorSorter;
import pl.dg.designpattern.facade.cloth.ClothFabricSorter;
import pl.dg.designpattern.facade.cloth.Color;
import pl.dg.designpattern.facade.cloth.Fabric;
import pl.dg.designpattern.facade.dryer.Dryer;
import pl.dg.designpattern.facade.washer.Program;
import pl.dg.designpattern.facade.washer.Timer;
import pl.dg.designpattern.facade.washer.Washer;

/**
 *
 * @author HP
 */
public class WashClothes {

    private Washer washer;

    public void start() {
        List<Cloth> clothes = new ArrayList();
        clothes.add(new Cloth(Color.BLUE, Fabric.COTTON));
        clothes.add(new Cloth(Color.RED, Fabric.WOOL));
        clothes.add(new Cloth(Color.MIXED, Fabric.COTTON));
        clothes.add(new Cloth(Color.WHITE, Fabric.SILK));
        clothes.add(new Cloth(Color.BLUE, Fabric.WOOL));
        clothes.add(new Cloth(Color.BLUE, Fabric.WOOL));
        ClothColorSorter colorSorter = new ClothColorSorter(clothes);
        ClothFabricSorter fabricSorter = new ClothFabricSorter(colorSorter.getCloths(Color.MIXED));
        clothes = fabricSorter.getClothes(Fabric.WOOL);
        Timer timer = new Timer(60);
        washer = new Washer(Program.BLACK, timer);
        washer.insertClothes(clothes);
        washer.startWashing();
    }

    public void stop() {
        washer.stopWashing();
        Dryer dryer = new Dryer();
        dryer.hangClothes(washer.getClothes());
    }
}
