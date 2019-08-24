/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.facade.cloth;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author HP
 */
public class ClothColorSorter {

    private final List<Cloth> clothes;

    public ClothColorSorter(List<Cloth> clothes) {
        this.clothes = clothes;
    }

    public List<Cloth> getCloths(Color color) {
        return clothes.stream().filter(cloth -> cloth.getColor().equals(color) || color.equals(Color.MIXED)).collect(Collectors.toList());
    }
}
