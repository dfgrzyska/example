/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.proxy;

import pl.dg.designpattern.proxy.externallib.BookDetails;
import pl.dg.designpattern.proxy.externallib.BookStream;

/**
 *
 * @author HP
 */
public class BookStreamProxy implements BookDetails {

    private BookStream bookStream;
    private final String title;

    public BookStreamProxy(String title) {
        this.title = title;
    }

    @Override
    public int getNumbeOfPages() {
        if (isMissingBookStream()) {
            createBookStream();
        }

        return bookStream.getNumbeOfPages();

    }

    @Override
    public String getTitle() { //cheap operation
        return title;
    }

    private boolean isMissingBookStream() {
        return bookStream == null;
    }

    @Override
    public String getAuthor() {
        if (isMissingBookStream()) {
            createBookStream();
        }

        return bookStream.getAuthor();
    }

    private void createBookStream() {
        bookStream = new BookStream(title);
    }

}
