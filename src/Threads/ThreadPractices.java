package Threads;

public class ThreadPractices {
    public static void main(String[] args) {
        First obj1 = new First();
        Second obj2 = new Second();
        obj1.start();
        obj2.start();

    }
}

class First extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("in A");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Second extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("in B");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}