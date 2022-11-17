package hiding;

class BirthDay {
    private int day; //private하면 값을 숨김.
    //세팅 하고싶으면,
    private int month;
    private int year;
    private static int count = 0;

    public BirthDay returnself(){
        return this;
    }

    public BirthDay(){
        //this 앞에는 그 어떤 statement도 올 수 없다. 객체 생성이 완전하지 않기 때문.
        this(0,0,0); //BirthDay(0,0,0)을 실행해줌
        //default값을 설정하는 방법이다.
    }
    public BirthDay(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getDay() {
        count++;
        if (day != 0) {
            System.out.println("설정하신 일이 없습니다.");
            return 0;
        }
        else{
            return this.day;
        }
    }

    public int getMonth(){
        count++;
        return this.month;
    }

    public int getYear(){
        count++;
        return this.year;
    }

    public void setDay(int day) {
        count++;
        if (month == 2 && day <= 29) {
            this.day = day;
            System.out.println("일을"+this.day+"일로 설정하셨습니다.");
        }
        else{
            System.out.printf("날짜 오류 입니다.");
        }
    }
    public void setMonth(int Month){
        count++;
        this.month= Month;
        System.out.println("달을"+this.month+"월로 설정하셨습니다.");
    }
    public void setYear(int year){
        count++;
        this.year= year;
        System.out.println("연도를"+this.year+"년으로 설정하셨습니다.");
    }

}

public class BirthDayTest{
    public static void main(String[] args){
        BirthDay day = new BirthDay();

        day.setMonth(2);
        day.setDay(30);
        day.setYear(2000);

        System.out.println(day.getMonth());
        BirthDay day_2 = new BirthDay();

        System.out.println(day_2.getMonth());
        System.out.println(day_2.returnself());
    }
}

//public 하면 모든 파일에 open
//public 안하면 default는 패키지 안에서만 가능
//private하면 클래스 안에서만 사용 가능.