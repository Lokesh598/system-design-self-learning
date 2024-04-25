package org.flipkart.model;

import java.util.List;
import java.util.Map;

public class Member {
    private String memberId;
    private String memberName;
//    private List<BorrowBook> borrowBooks;
     Map<String, Integer>
    public Member(String memberId, String memberName, List<BorrowBook> borrowBooks) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.borrowBooks = borrowBooks;
    }
    {
        memberId
                map
    }
    public Member() {

    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<BorrowBook> getBorrowBooks() {
        return borrowBooks;
    }

    public void setBorrowBooks(List<BorrowBook> borrowBooks) {
        this.borrowBooks = borrowBooks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", borrowBooks=" + borrowBooks +
                '}';
    }
}
