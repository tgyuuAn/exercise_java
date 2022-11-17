package cooperation;

public class test {
    public static void main(String[] args){
        Student AnTaeGyu = new Student("안태규",10000);
        Bus Bus_132 = new Bus(132);
        Subway subway_2 = new Subway(2);

        AnTaeGyu.takeBus(Bus_132);
        AnTaeGyu.showInfo();
        Bus_132.showInfo();
    }
}
