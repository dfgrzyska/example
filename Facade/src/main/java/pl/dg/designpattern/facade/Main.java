/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.facade;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        WashClothes wash = new WashClothes();
        wash.start();
        wash.stop();
    }
}
