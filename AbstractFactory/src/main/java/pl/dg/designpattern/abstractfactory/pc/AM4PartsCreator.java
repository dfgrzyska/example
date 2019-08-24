/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.abstractfactory.pc;


public class AM4PartsCreator implements PartsCreator {

    @Override
    public Mainboard getMainboard() {
        return new Am4Mainboard();
    }

    @Override
    public Cpu getCpu() {
        return new AM4Cpu();
    }
    
}
