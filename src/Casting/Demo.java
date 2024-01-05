package Casting;

public class Demo {
    public static void main(String[] args) {
    // Upcasting
    A obj = new B();
    obj.show();

    // Downcasting
    B obj2 = (B) obj;
        obj2.show2();

}
}

    


class A{
    public void show() {
        System.out.println("in A");
    }

}

class B extends A{
    public void show2() {
        System.out.println("in B");
    }
}