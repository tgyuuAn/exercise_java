package refrence;

public class Student {
    int studentID;
    String studentName;
    Subject korea,math,english;

    public Student(){
        korea = new Subject("국어");
        math = new Subject("수학");
        english = new Subject("여어");
    }

    public Student(int id, String name){

        studentName = name;
        studentID = id;

        korea = new Subject("국어");
        math = new Subject("수학");
        english = new Subject("영어");
    }

    public void setKorea(int score){
        korea.setScore(score);
    }

    public void setMath(int score){
        math.setScore(score);
    }
    public void setEnglish(int score) {
        english.setScore(score);
    }
    public void showInformation(){
        int total = korea.getScore() + math.getScore() + english.getScore();
        System.out.println(studentName + " 학생의 총점은" + total + "점 입니다.");
    }
}
