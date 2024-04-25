package org.flipkart.controller;

import org.flipkart.model.Book;
import org.flipkart.repository.BookRepository;

import java.util.List;
import java.util.stream.Collectors;

public class BookController {
    BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public BookRepository getBookRepository() {
        return this.bookRepository;
    }
    public void addBook(String id, String title, String author, int copies) {
        Book book = new Book();
        book.setBookId(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setCopies(copies);
        bookRepository.addBook(book);
        getBookInfo(Integer.parseInt(id));
    }

    public void getBookInfo(int id) {
        bookRepository.getBookList().stream().filter(i->Integer.parseInt(i.getBookId()) == id).forEach(System.out::println);
    }
}
