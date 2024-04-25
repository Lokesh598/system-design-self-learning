package org.flipkart.controller;

import org.flipkart.model.Book;
import org.flipkart.model.Member;
import org.flipkart.repository.BookRepository;
import org.flipkart.repository.MemberRepository;
import org.flipkart.service.impl.BookService;
import org.flipkart.service.impl.BookServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import static org.flipkart.controller.BooksController.bookController;


public class Driver {

    static BookServiceImpl bookService = new BookService();
    public static void main(String[] args) {
        BookController bookController = new BookController();
        MemberController memberController = new MemberController();
       // BookServiceImpl bookService = new BookService();
        bookController.setBookRepository(new BookRepository());
        memberController.setMemberRepository(new MemberRepository());

        // register book
        bookController.addBook("1", "Pride and Prejudice", "Jane Austen", 3);
        bookController.addBook("2", "To Kill a Mockingbird", "Harper Lee", 2);
//        System.out.println("hi");

//        bookController.getBookInfo(1);

        memberController.addMember("1", "Alice Johnson");
        memberController.addMember("2", "Johnson");

        bookController.getBookInfo(1);
        bookController.getBookInfo(2);
//        bookController.getBookRepository().getBookList().stream().toList().forEach(System.out::println);
//        memberController.getMemberRepository().getMembersList().stream().toList().forEach(System.out::println);

        //borrowBook
        bookController.borrowBook("1","1");
//
//
//        //returnBook
//        bookService.returnBook();
//
//        bookService.isBookAvailable();
    }

//    public static void borrowBook(String  memberId, String bookId) {
//
//        List<Book> book = bookController.getBookRepository().getBookList().stream().filter(i->i.getBookId() == bookId).collect(Collectors.toList());
//        List
//        Member member = members.get(memberId);
//        Book book = books.get(bookId);
//        if (book.getCopies() > 0) {
//            book.setStatus("Borrowed");//
//            book.setCopies(book.getCopies() - 1);

//            member.borrowBook(book);
//        }
//    }
//
//    public void returnBook(int memberId, int bookId) {
//        Member member = memberController.getMemberRepository().getMembersList().stream().toList()
//        Book book = books.getB(bookId);
//        if (member != null && book != null && member.getBorrowedBooks().contains(book)) {
//            book.setStatus("Available");
//            book.setCopies(book.getCopies() + 1);
//            member.returnBook(book);
//        }
//    }
//
//    public List<Book> getBorrowedBooksByMember(int memberId) {
//        Member member = memberController.getMemberRepository().getMembersList().stream().toList();
//        if (member != null) {
//            return member.getBorrowedBooks();
//        }
//        return new ArrayList<>();
//    }
//
//    public String isBookAvailable(int bookId) {
//        Book book = bookController.getBookRepository().getBookList().stream().toList()
//        if (book != null) {
//            return book.getStatus();
//        }
//        return "Book not found";
//    }
}