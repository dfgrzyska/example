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
public class ClothFabricSorter {

    private final List<Cloth> clothes;

    public ClothFabricSorter(List<Cloth> clothes) {
        this.clothes = clothes;
    }

    public List<Cloth> getClothes(Fabric fabric) {
        return clothes.stream().filter(cloth -> cloth.getFabric().equals(fabric)).collect(Collectors.toList());
    }

}
