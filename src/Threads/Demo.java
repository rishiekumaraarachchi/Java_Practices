package Threads;

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }
}

class  A extends Thread{
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

class B extends Thread{
    public void run (){
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