package lambda;

public class TestMyNumber {
    public static void main(String[] args){
        MyNumber maxNum = (x,y) -> (x >= y)? x: y;
        System.out.println(maxNum.getMaxNumber(10,20));


    }
}
