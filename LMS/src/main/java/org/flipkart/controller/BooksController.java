package org.flipkart.controller;

import org.flipkart.model.Book;
import org.flipkart.model.Member;
import org.flipkart.repository.BookRepository;
import org.flipkart.repository.MemberRepository;
import org.flipkart.service.impl.BookService;
import org.flipkart.service.impl.BookServiceImpl;

import java.util.List;

public class BooksController {

    static BookServiceImpl bookService = new BookService();

    static BookController bookController = new BookController();
    static MemberController memberController = new MemberController();
    public static void main(String[] args) {


        bookController.addBook("1", "Pride and Prejudice", "Jane Austen", 3);
        bookController.addBook("2", "To Kill a Mockingbird", "Harper Lee", 2);
        memberController.addMember("1", "Alice Johnson");

//        borrowBook("1","1");


    }
}
