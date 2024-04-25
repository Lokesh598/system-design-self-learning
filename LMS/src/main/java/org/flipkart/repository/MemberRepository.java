package org.flipkart.repository;

import org.flipkart.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Member> membersList;

//    Map<String, Member>

    public MemberRepository() {
        this.membersList = new ArrayList<>();
    }

    public void addMember(Member member) {
        membersList.add(member);
    }

    public List<Member> getMembersList() {
        return membersList;
    }

    public Member getMemberById(String id) {
        for (Member member : membersList) {
            if (member.getMemberId().equals(id)) {
                return member;
            }
        }
        return null;
    }
}
