class table {
    synchronized void printTable(int n) {  // synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try { Thread.sleep(400); } catch (Exception e) {}
        }
    }
}

class MyThread1 extends Thread {
    table t;
    MyThread1(table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    table t;
    MyThread2(table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}

public class Mythread1 {
    public static void main(String[] args) {
        table obj = new table(); // only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
