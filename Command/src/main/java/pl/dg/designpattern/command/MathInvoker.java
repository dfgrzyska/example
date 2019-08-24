/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.command;

import java.util.ArrayDeque;

/**
 *
 * @author HP
 */
public class MathInvoker implements Invoker {

    ArrayDeque<Command> toUndoList = new ArrayDeque(100);

    @Override
    public void execute(Command command) {
        command.execute();
        toUndoList.add(command);
    }

    @Override
    public void undo() {
        toUndoList.pollLast().unexecute();
    }

}
