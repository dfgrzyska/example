/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.proxy.externallib;

/**
 *
 * @author HP
 */
public class BookStream implements BookDetails {

    private final Book book;

    public BookStream(String title) {
        this.book = new Book(title); //heavy operation
    }

    @Override
    public int getNumbeOfPages() {
        return book.getPages().size();
    }

    @Override
    public String getAuthor() {
        return book.getAuthor();
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }
}
