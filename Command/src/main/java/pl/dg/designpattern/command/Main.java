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
public class Main {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command x2 = new Multiplicationx2Command(receiver);
        Command pow2 = new Power2Command(receiver);
        Invoker invoker = new MathInvoker();

        invoker.execute(x2);
        invoker.execute(pow2);
        invoker.execute(pow2);
        invoker.undo();
        invoker.undo();
    }

}
