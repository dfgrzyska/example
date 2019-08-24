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
public class Am4Mainboard implements Mainboard {

    private final String[] mainboards;

    public Am4Mainboard() {
        this.mainboards = new String[]{"Gigabyte B450 AORUS ELITE", "Gigabyte GA-A320M-S2H", "Gigabyte B450M DS3H", "MSI B450 GAMING PLUS", "MSI B450 TOMAHAWK"};
    }

    @Override
    public String getDescription() {
        return mainboards[new Random().nextInt(5)];
    }

}
