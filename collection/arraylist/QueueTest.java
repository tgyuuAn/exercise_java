package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        if (arrayQueue.size() > 0) return arrayQueue.remove(0);
        else {
            System.out.println("큐가 비었습니다.");
            return null;
        }
    }

    public void showStackInfo() {
        System.out.println(arrayQueue);
    }
}

public class QueueTest {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.enQueue("개토레이");
        queue.enQueue("콜라");
        queue.enQueue("사이다");
        queue.showStackInfo();
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.showStackInfo();
}
}
