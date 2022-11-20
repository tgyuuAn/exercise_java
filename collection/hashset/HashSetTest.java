package collection.hashset;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set.add("A"));

        System.out.println(set);
        //객체에 대한 set 같음 여부는
        //eqauls() 메소드랑 hashCode() 메소드를 overRide 해야함.

    }
}
