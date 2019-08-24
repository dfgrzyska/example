/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.decorator.pc;

public class PersonalComputer extends AbstractProduct {

    public PersonalComputer() {
        description = "Personal Computer Parts: ";
    }

    @Override
    public double getPrice() {
        return 0;
    }

}
