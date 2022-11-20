package collection.arraylist;
import java.util.ArrayList;
class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        if (arrayStack.size() > 0) return arrayStack.remove(arrayStack.size() - 1);
        else {
            System.out.println("스택이 비었습니다.");
            return null;
        }
    }

    public String peek() {
        if (arrayStack.size() > 0) return arrayStack.get(arrayStack.size() - 1);
        else {
            System.out.println("스택이 비었습니다.");
            return null;
        }
    }

    public void showStackInfo() {
        System.out.println(arrayStack);
    }
}

public class StackTest {
    public static void main(String[] args){
        MyStack stack = new MyStack();
        stack.push("개토레이");
        stack.push("콜라");
        stack.push("사이다");
        stack.showStackInfo();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.showStackInfo();
    }
}
