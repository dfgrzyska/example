/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern;

import pl.dg.designpattern.decorator.file.AbstractFileSaver;
import pl.dg.designpattern.decorator.file.FileSaver;
import pl.dg.designpattern.decorator.file.FileSaverAdditionalLogs;
import pl.dg.designpattern.decorator.pc.RamDecorator;
import pl.dg.designpattern.decorator.pc.CpuDecorator;
import pl.dg.designpattern.decorator.pc.AbstractProduct;
import pl.dg.designpattern.decorator.pc.MainboardDecorator;
import pl.dg.designpattern.decorator.pc.PersonalComputer;

/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {
        AbstractProduct pc = new PersonalComputer();
        pc = new MainboardDecorator(pc, "Gigabyte MTX-B450-2", 350);
        pc = new CpuDecorator(pc, "Ryzen 2700X", 1000);
        pc = new RamDecorator(pc, "GOODRAM 3200MHZ 16GB", 280);

        System.out.println(pc.getDescription() + "\n final price: " + pc.getPrice());
        
        AbstractFileSaver fileSaver = new FileSaver();
        fileSaver = new FileSaverAdditionalLogs(fileSaver);
        fileSaver.saveFile("save this string to file!");
        
    }
}
