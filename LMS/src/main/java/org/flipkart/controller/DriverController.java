//package org.flipkart.controller;
//
//import org.flipkart.model.Book;
//import org.flipkart.model.Member;
//import org.flipkart.repository.BookRepository;
//import org.flipkart.repository.MemberRepository;
//
//public class DriverController {
//    BookRepository bookRepository;
//
//    MemberRepository memberRepository;
//
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//    public BookRepository getBookRepository() {
//        return this.bookRepository;
//    }
//
//    public void setMemberRepository(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }
//    public MemberRepository getMemberRepository() {
//        return this.memberRepository;
//    }
//
//    public void addBook(String id, String title, String author, int copies) {
//        Book book = new Book();
//        book.setBookId(id);
//        book.setTitle(title);
//        book.setAuthor(author);
//        book.setCopies(copies);
//        bookRepository.addBook(book);
//    }
//
//    public void addMember(String id, String name) {
//        Member member = new Member();
//
//        member.setMemberId(id);
//        member.setMemberName(name);
//
//        memberRepository.addMember(member);
//    }
//}
