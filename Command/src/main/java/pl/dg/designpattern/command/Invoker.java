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
public interface Invoker {

    void execute(Command command);

    void undo();
}
