/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.proxy.externallib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Book {

    List<Page> pages = new ArrayList();
    private final String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "random author";
        try {
            Thread.sleep(10000);
            for (int i = 0; i <= new Random().nextInt(500) + 10; i++) {
                pages.add(new Page());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Page> getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
