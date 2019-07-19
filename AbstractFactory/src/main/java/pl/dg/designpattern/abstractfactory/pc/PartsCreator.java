/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.abstractfactory.pc;

/**
 *
 * @author HP
 */
public interface PartsCreator {

    Mainboard getMainboard();

    Cpu getCpu();
}
