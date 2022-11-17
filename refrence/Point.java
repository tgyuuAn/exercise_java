package refrence;

public class Point {
    public static void main(String[] args){
        Student AnTaeGyu = new Student(201912047,"안태규");
        System.out.println(AnTaeGyu);
        AnTaeGyu.setKorea(100);
        AnTaeGyu.setMath(90);
        AnTaeGyu.setEnglish(95);
        AnTaeGyu.showInformation();
    }
}
