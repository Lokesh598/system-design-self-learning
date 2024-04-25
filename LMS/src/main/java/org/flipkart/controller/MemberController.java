package org.flipkart.controller;

import org.flipkart.model.Book;
import org.flipkart.model.Member;
import org.flipkart.repository.MemberRepository;

import java.util.List;

public class MemberController {

    MemberRepository memberRepository;

    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public MemberRepository getMemberRepository() {
        return this.memberRepository;
    }

    public void addMember(String id, String name) {
        Member member = new Member();

        member.setMemberId(id);
        member.setMemberName(name);

        memberRepository.addMember(member);
        printMemberInfo(id);
    }

//    public void getBook(String id, String prideAndPrejudice) {
//        for (Book book : getBoolC)
//    }

    public void printMemberInfo(String id) {
        System.out.println(memberRepository.getMemberById(id));
    }
}
