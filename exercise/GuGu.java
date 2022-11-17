package exercise;

public class GuGu {
    public static void main(String[] args){
        Main studentLee = new Main("안태규",201912047);
        studentLee.address = "부산광역시 남구 대연동";
        studentLee.grade = 2;
        studentLee.showStudentInfo();
        System.out.println("\n"+studentLee.getStudentaddress());

    }
}
