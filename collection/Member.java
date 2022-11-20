package collection;

import java.util.Comparator;

//Comparable<Member>을 implements한 이유는 TreeSet을 쓰기위해.
public class Member implements Comparable<Member>, Comparator<Member> {
    private int memberID;
    private String memberName;

    public Member(int memberID, String memberName){
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public Member(){}
    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString(){
        return memberName+"회원님의 아이디는 "+memberID+"입니다.";
    }

    @Override
    public int hashCode() {
        return this.memberID;
    }

    @Override
    public int compare(Member member1, Member member2) {
        return member1.memberID - member2.memberID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member)obj;
            if(this.memberID == member.memberID){
                return true;
            }
            else return false;
        }
        return false;
    }


    @Override
    //TreeSet을 사용하기 위해 꼭 구현되어야 하는 것
    public int compareTo(Member member){

        return (this.memberName.compareTo(member.memberName));
        //양수가 반환되면 오름차순, 음수면 내림차순으로 정렬.
        //String을 비교하기 위해서는 compareTo 사용
        //String은 compareTo가 이미 구현되어 있음.
    }
}