/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.facade.washer;

import java.util.List;
import pl.dg.designpattern.facade.cloth.Cloth;

/**
 *
 * @author HP
 */
public class Washer {

    private final Program program;
    private final Timer timer;
    private WasherState washerState;
    private List<Cloth> clothes;

    public Washer(Program program, Timer timer) {
        this.program = program;
        this.timer = timer;
    }

    public void startWashing() {
        System.out.println("WASH!");
    }

    public void stopWashing() {
        System.out.println("Done!");
    }

    public void insertClothes(List<Cloth> clothes) {
        System.out.println("Inserting number of cloths: " + clothes.size());
        this.clothes = clothes;
    }

    public List<Cloth> getClothes() {
        return clothes;
    }
}
