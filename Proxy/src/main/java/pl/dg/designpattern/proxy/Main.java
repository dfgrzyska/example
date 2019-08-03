/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.proxy;

import pl.dg.designpattern.proxy.externallib.BookDetails;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        BookDetails bd = new BookStreamProxy("Lord of the Rings"); //lazy
        System.out.println("Title: " + bd.getTitle()); //cheap
        System.out.println("Number of pages: " + bd.getNumbeOfPages()); //expensive
    }
}
