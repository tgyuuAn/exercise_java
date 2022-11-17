package cooperation;

public class Student {
    String studentName;
    int grade, money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(700);
        this.money -= 700;
    }

    public void showInfo(){
        System.out.println("이름은 : "+this.studentName+"돈은 : "+this.money);
    }
}
