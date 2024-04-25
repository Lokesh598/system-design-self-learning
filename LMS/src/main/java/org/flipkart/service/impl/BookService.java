package org.flipkart.service.impl;

import org.flipkart.model.Book;
import org.flipkart.model.Member;
import org.flipkart.repository.BookRepository;

import java.util.List;

public class BookService implements BookServiceImpl{

    public static BookRepository bookRepository = new BookRepository();
    @Override
    public List<Book> printListOfBook() {
        try {
            return bookRepository.getBookList();
        } catch (NullPointerException e) {
            System.out.println("Book list can be null");
        }
        return null;
    }

    @Override
    public void isBookAvailable() {

    }
}
//
//    @Override
//    public void borrowBook() {
//
//    }
//
//    @Override
//    public void returnBook() {
//
//    }
//
//    @Override
//    public void isBookAvailable() {
//
//    }
//
//    public void borrowBook(int memberId, int bookId) {
//        Member member = members.get(memberId);
//        Book book = books.get(bookId);
//        if (member != null && book != null && book.getStatus().equals("Available") && book.getCopies() > 0) {
//            book.setStatus("Borrowed");
//            book.setCopies(book.getCopies() - 1);
//            member.borrowBook(book);
//        }
//    }
//
//    public void returnBook(int memberId, int bookId) {
//        Member member = members.get(memberId);
//        Book book = books.get(bookId);
//        if (member != null && book != null && member.getBorrowedBooks().contains(book)) {
//            book.setStatus("Available");
//            book.setCopies(book.getCopies() + 1);
//            member.returnBook(book);
//        }
//    }
//
//    public List<Book> getBorrowedBooksByMember(int memberId) {
//        Member member = members.get(memberId);
//        if (member != null) {
//            return member.getBorrowedBooks();
//        }
//        return new ArrayList<>();
//    }
//
//    public String isBookAvailable(int bookId) {
//        Book book = books.get(bookId);
//        if (book != null) {
//            return book.getStatus();
//        }
//        return "Book not found";
//    }
//}
