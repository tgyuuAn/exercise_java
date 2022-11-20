package collection.treeset;
import collection.Member;
import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args){
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(102,"이순신");
        Member memberKim = new Member(101,"김유신");
        Member memberShin = new Member(103,"신사임당");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberShin);
        memberTreeSet.showAll();
        //TreeSet을 사용하려면 사용하려는 객체에 Comparable<사용하려는객체>를 implements 해야함.
        //그리고 compareTo를 overridng 해야함.
    }
}
