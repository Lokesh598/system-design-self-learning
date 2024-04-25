package org.flipkart.repository;

import org.flipkart.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> bookList;

    public BookRepository() {
        bookList = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }
    public Book getBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
