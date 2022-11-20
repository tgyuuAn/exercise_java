package collection.hashmap;
import collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args){
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(102,"이순신");
        Member memberKim = new Member(101,"김유신");
        Member memberShin = new Member(103,"신사임당");
        Member memberAn = new Member(103,"안태규");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberShin);
        memberHashMap.addMember(memberAn);
        //파이썬 딕셔너리 처럼 key값에 대입하는 형식이므로
        //같은 키값을 가지면 덮어 씌운다.
        memberHashMap.removeMember(101);
        memberHashMap.showAllMember();


    }
}
