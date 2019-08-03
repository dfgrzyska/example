/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.bridge;

import pl.dg.designpattern.bridge.part.Cpu;
import pl.dg.designpattern.bridge.part.GraphicCard;
import pl.dg.designpattern.bridge.specification.CpuSpecification;
import pl.dg.designpattern.bridge.specification.GraphicCardSpecification;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        Cpu ryzen3600x = new Cpu("3600x", "AMD", "8", "AM4");
        GraphicCard gtx1060 = new GraphicCard("GTX1060", "Nvidia", "8GB", 30);
        GraphicCardSpecification graphicCardSpec = new GraphicCardSpecification(gtx1060);
        CpuSpecification cpuSpec = new CpuSpecification(ryzen3600x);
        System.out.println(cpuSpec.getDescription());
        System.out.println(cpuSpec.getProducer());
        System.out.println(cpuSpec.getSnippet());
        System.out.println(graphicCardSpec.getDescription());
        System.out.println(graphicCardSpec.getProducer());
        System.out.println(graphicCardSpec.getSnippet());
    }
}
