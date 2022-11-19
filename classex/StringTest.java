package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");

        Constructor[] cons = strClass.getConstructors();

        for(Constructor c: cons){
            System.out.println(c);
        }
        //생산자 가져오기

        Field[] fields = strClass.getFields();
        for(Field f: fields){
            System.out.println(f);
        }
        //필드 가져오기

        Method[] methods = strClass.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        //메소드 가져오기

    }
}
