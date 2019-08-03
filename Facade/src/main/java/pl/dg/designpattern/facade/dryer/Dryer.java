/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.facade.dryer;

import java.util.List;
import pl.dg.designpattern.facade.cloth.Cloth;

/**
 *
 * @author HP
 */
public class Dryer {

    public void hangClothes(List<Cloth> clothes) {
        clothes.forEach(cloth -> System.out.println("DRYING!"));
    }
}
