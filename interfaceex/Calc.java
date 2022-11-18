package interfaceex;

public interface Calc {
    double PI = 3.14; // 상수 선언시 자동으로 public static final 이 앞에 붙는다.
    int ERROR = -99999999;

    int add(int num1, int num2); // = public abstract int add(int num1, int num2);
    int sub(int num1, int num2);
    int times(int num1, int num2);
    int divides(int num1, int num2);

    //인터페이스에는 상수와 추상 메소드로 구성된다.
    //인터페이스는 미리 각 함수가 어떤 인자가 들어갈 지 미리 알고 있어야 하므로, 숙련자 들이 많이 사용한다.
    //뼈대를 만드는 역할.
}
