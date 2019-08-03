/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.bridge.specification;

import pl.dg.designpattern.bridge.part.GraphicCard;

/**
 *
 * @author HP
 */
public class GraphicCardSpecification implements Specification {

    private final GraphicCard graphicCard;

    public GraphicCardSpecification(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String getProducer() {
        return graphicCard.getManufacturer();
    }

    @Override
    public String getDescription() {
        return getSnippet() + " " + this.graphicCard.getMemory() + " " + this.graphicCard.getLength();
    }

    @Override
    public String getSnippet() {
        return this.graphicCard.getManufacturer() + " " + this.graphicCard.getModel();
    }

}
