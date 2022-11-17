package exercise;

public class Main{
    int studentID=0, grade=0;
    String studentName="나나나", address="부산";

    public Main(String Name, int ID){
        studentName = Name;
        studentID = ID;
    }
    public void showStudentInfo(){
        System.out.printf("%d %s %s %d",studentID,studentName,address,grade);
    }

    public String getStudentaddress(){
        return address;
    }

    public static void main(String[] args){
        Main TaeGyuAn = new Main("안태규",201912047);
        TaeGyuAn.address = "김해시 장유";
        TaeGyuAn.showStudentInfo();

        Main SongSuBin = new Main("송수빈",201911047);
        SongSuBin.showStudentInfo();
    }
}