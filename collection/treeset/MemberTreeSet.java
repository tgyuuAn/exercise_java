package collection.treeset;
import java.util.TreeSet;
import collection.Member;
import java.util.Iterator;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<>(new Member());
    }
    public void addMember(Member member){
        treeSet.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            if(member.getMemberID() == memberID){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID +" 가 존재하지 않습니다.");
        return false;
    }

    public void showAll(){
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member);
        }
    }
}
