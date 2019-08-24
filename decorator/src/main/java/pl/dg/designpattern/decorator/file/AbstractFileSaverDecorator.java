/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.decorator.file;

/**
 *
 * @author HP
 */
public abstract class AbstractFileSaverDecorator implements AbstractFileSaver {

    protected AbstractFileSaver fileSaver;

    public AbstractFileSaverDecorator(AbstractFileSaver fileSaver) {
        this.fileSaver = fileSaver;
    }

    @Override
    public abstract boolean saveFile(String value);
}
