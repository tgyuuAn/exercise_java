package classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person = new Person();

        Class pClass1 = person.getClass(); // class 가져오는 첫번째 방법

        System.out.println(person.getAge());
        System.out.println(pClass1.getName());
        //getClass 메서드는 Object의 메소드임.
        //이미 인스턴스가 있을경우 getClass를 통해 Class 클래스를 가져올 수 있음.

        Class pClass2 = Person.class; // class 가져오는 두번째 방법
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("java.lang.String"); // class 가져오는 세번째 방법
        //forName이 하는 역할은 안에 String 형태의 이름의 class가 있으면, 메모리를 가져온다.
        //실제로 없는 class이면 에러가 일어난다.
        System.out.println(pClass3.getName());

        Person p = new Person();

        Class pClass = Class.forName("classex.Person");
        //Person 클래스 불러오기

        Person p2 = (Person)pClass.newInstance();
        //newInstance() 가 생성되면 default생성자가 불려짐
    }
}