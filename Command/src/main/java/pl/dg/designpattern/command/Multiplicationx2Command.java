/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.command;

/**
 *
 * @author HP
 */
public class Multiplicationx2Command implements Command {
    
    private final Receiver receiver;
    
    public Multiplicationx2Command(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.setValue(receiver.getValue() * 2);
    }
    
    @Override
    public void unexecute() {
        receiver.setValue(receiver.getValue() / 2);
    }
    
}
