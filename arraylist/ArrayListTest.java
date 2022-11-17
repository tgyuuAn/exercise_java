package arraylist;
import java.util.ArrayList;
//어레이 리스트를 쓰기위한 모듈
public class ArrayListTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        studentLee.showStudentInfo();

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 80);
        studentKim.addSubject("수학", 70);
        studentKim.addSubject("영어", 90);

        studentKim.showStudentInfo();



    }
    //Arraylist에서 값을 접근할때는 .get[index]로 접근해야함.
    //Arraylist에서는 배열로 직접 접근 불가능 list[index] 불가

}
