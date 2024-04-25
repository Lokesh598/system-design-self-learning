package org.flipkart.controller;

import org.flipkart.model.Book;
import org.flipkart.model.Member;
import org.flipkart.repository.BookRepository;
import org.flipkart.repository.MemberRepository;

public class DriverControllerTest {

    public static void main(String[] args) {
        testAddBook();
        testAddMember();
    }

    public static void testAddBook() {
        BookRepository bookRepository = new BookRepository();

        BookController bookController = new BookController();
        bookController.setBookRepository(bookRepository);
        bookController.addBook("1", "Pride and Prejudice", "Jane Austen", 3);

        Book addedBook = bookRepository.getBookById("1");

        if (addedBook != null && addedBook.getTitle().equals("Pride and Prejudice")) {
            System.out.println("Test Add Book: PASSED");
        } else {
            System.out.println("Test Add Book: FAILED");
        }
    }

    public static void testAddMember() {
        MemberRepository memberRepository = new MemberRepository();

        MemberController memberController = new MemberController();
        memberController.setMemberRepository(memberRepository);

        memberController.addMember("1", "Alice Johnson");

        Member addedMember = memberRepository.getMemberById("1");

        if (addedMember != null && addedMember.getMemberName().equals("Alice Johnson")) {
            System.out.println("Test Add Member: PASSED");
        } else {
            System.out.println("Test Add Member: FAILED");
        }
    }
}
