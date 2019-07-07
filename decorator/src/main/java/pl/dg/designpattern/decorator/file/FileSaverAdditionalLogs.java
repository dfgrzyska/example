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
public class FileSaverAdditionalLogs extends AbstractFileSaverDecorator {

    public FileSaverAdditionalLogs(AbstractFileSaver fileSaver) {
        super(fileSaver);
    }

    @Override
    public boolean saveFile(String value) {
        System.out.println("Save value: " + value);
        return fileSaver.saveFile(value);
    }

}
