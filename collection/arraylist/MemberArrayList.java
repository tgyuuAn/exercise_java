package collection.arraylist;
import collection.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberID) {
/*        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempID = member.getMemberID();
            if (tempID == memberID) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberID + "가 ArrayList에 없습니다.");
        return false;
 */
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) { //hasNext()는 이터레이터가 다음 값을 가지고 있냐 없냐, 있으면 True, 없으면 False
            Member member = iterator.next();
            int tempID = member.getMemberID();
            if (tempID == memberID) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 ArrayList에 없습니다.");
        return false;
    }
    public void showAll() {
        Iterator<Member> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member);
        }
    }
}
