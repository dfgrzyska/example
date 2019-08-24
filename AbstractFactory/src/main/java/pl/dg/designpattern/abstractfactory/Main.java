/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.abstractfactory;

import pl.dg.designpattern.abstractfactory.pc.AM4PartsCreator;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        orderPartsForSocket("AM4", 5);
        orderPartsForSocket("AM3", 523);
    }

    private static void orderPartsForSocket(String socket, int numberOfComputer) {
        switch (socket) {
            case "AM4": {
                AM4PartsCreator creator = new AM4PartsCreator();
                for (int i = 0; i < numberOfComputer; i++) {
                    System.out.println("Cpu: " + creator.getCpu().getDescription() + " Mainboard: " + creator.getMainboard().getDescription());
                }
                return;
            }
            default: {
                System.out.println("unavailable!");
            }
        }

    }
}
