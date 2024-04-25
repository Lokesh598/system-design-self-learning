package org.flipkart.service.impl;

import org.flipkart.model.Book;

import java.util.List;

public interface BookServiceImpl {
    List<Book> printListOfBook();
//
//    void borrowBook();
//
//    void returnBook();

    void isBookAvailable();
}
