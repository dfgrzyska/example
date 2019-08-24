/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.abstractfactory.pc;

import java.util.Random;

/**
 *
 * @author HP
 */
public class AM4Cpu implements Cpu {

    private final String[] cpus;

    public AM4Cpu() {
        this.cpus = new String[]{"Ryzen 3600", "Ryzen 3600X", "Ryzen 3700", "Ryzen 3700X", "Ryzen 3900X"};
    }

    @Override
    public String getDescription() {
        return cpus[new Random().nextInt(5)];
    }

}
