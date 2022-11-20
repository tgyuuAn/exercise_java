package collection.hashset;
import java.util.HashSet;
import collection.Member;

public class MemberHashSet {
    Member memberLee = new Member(10101,"이순신");
    HashSet<Member> set = new HashSet<>();

    public void addSet(Member member){
        set.add(member);
    }



}
