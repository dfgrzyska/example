/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.bridge.view;

import pl.dg.designpattern.bridge.specification.Specification;

/**
 *
 * @author HP
 */
public class BasicView extends View {

    public BasicView(Specification specification) {
        super(specification);
    }

    @Override
    void show() {

    }

}
