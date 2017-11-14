package twothreads;

/**
 *
 * @author up826133
 */
public class TwoThreads {

    public static void main(String[] args) throws Exception {

        MyThread.q = new Queue();
        MyThread t1 = new MyThread();
        t1.changeName("A");

        MyThread2 t2 = new MyThread2();
        t2.changeName("B");

        t1.start();
        t2.start();

        t2.join();
        t1.join();
    }

}

class MyThread extends Thread {

    protected String name;

    volatile static Queue q;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            q.add("message" + i);
        }
    }

    public void changeName(String _name) {
        name = _name;
    }
}

class MyThread2 extends MyThread {
    
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(q.rem()+" removed");
        }
    }
}

class Queue {

    volatile Node front, back;

    synchronized void add(String data) {
        if (front != null) {
            back.next = new Node(data);
            back = back.next;
        } else {
            front = new Node(data);
            back = front;
        }
    }

    synchronized String rem() {
        // returns null if queue empty
        String result = null;
        if (front != null) {
            result = front.data;
            front = front.next;
        }
        return result;
    }
}

class Node {

    Node(String data) {
        this.data = data;
    }

    String data;
    Node next;
}
