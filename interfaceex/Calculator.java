package interfaceex;

public class Calculator implements Calc{

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divides(int num1, int num2) {
        if(num2!=0){
            return num1/num2;
        }
        return ERROR;
    }
}
