package singleton;

public class Company {
    private static Company instance = new Company();
    //singletone패턴이란, 모든 자식 클래스 들 중 인스턴스가 단 하나만 존재해야할 때.
    //상위 클래스에서 private로 인스턴스를 선언. 그리고 static으로 모든 하위 클래스에서 하나의 주소만을 바라보게 한다.
    //그럼 어떻게 그걸 가져올 수 있느냐?
    private Company(){} //Company객체는 private로 다른 곳에서 선언 할 수 없다.

    //singletone 인스턴스를 얻기위해 public 메소드를 하나 만드는데, 이 때 객체를 다른곳에서 만들 수 없으니 일반적으로는 밖에서 이 메소드 사용이 불가능.
    //그렇기 때문에 static으로 선언해서 class이름만으로 부를 수 있게 해준다. !
    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }
}
