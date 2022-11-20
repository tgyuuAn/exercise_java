package collection.hashmap;
import collection.Member;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }
    public void addMember(Member member){
        hashMap.put(member.getMemberID(),member);
    }
    public boolean removeMember(int memberID){
        if(hashMap.containsKey(memberID)){
            hashMap.remove(memberID);
            return true;
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        //keySet()은 그 해쉬 맵의 모든 키 들을 가져온다. 그리고 그걸 iterator()로 바꾼다.
        while (ir.hasNext()) {
            int key = ir.next();
            System.out.println(hashMap.get(key));
            //해쉬맵은 꺼낼때 get(키값)으로 가져온다.
        }
    }
}
