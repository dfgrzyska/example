/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.pc;

/**
 *
 * @author HP
 */
public interface PartCreator<T extends Enum<T> & PartType> {

    Part createPart(T partType);
}
