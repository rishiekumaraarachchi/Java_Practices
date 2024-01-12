package Threads;

public class DemoRun {
    public static void main(String[] args) {
        Runnable obj1 = new A1();
        Runnable obj2 = new B2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}

class A1 implements Runnable {
    public void run() {
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("in A");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B2 implements Runnable {
    public void run() {
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("in B");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}