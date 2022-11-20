package collection.arraylist;
import collection.Member;
import java.util.ArrayList;

public class MemberArrayListTest {
    public static void main(String[] args){

        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102,"김유신");
        Member memberShin = new Member(103,"신사임당");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberShin);

        memberArrayList.removeMember(memberKim.getMemberID());
        memberArrayList.showAll();
        //ArrayList의 toString()은 각각의 toString()을 ,로 구분지어서 List로 나타냄.

    }
}
