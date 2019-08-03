/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.facade.cloth;

/**
 *
 * @author HP
 */
public class Cloth {

    private final Color color;
    private final Fabric fabric;

    public Cloth(Color color, Fabric fabric) {
        this.color = color;
        this.fabric = fabric;
    }

    public Color getColor() {
        return color;
    }

    public Fabric getFabric() {
        return fabric;
    }

}
