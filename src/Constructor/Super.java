package Constructor;

public class Super {
    public static void main(String[] args) {
        B b = new B(10);
    }

}

class A {
    public A() {
        System.out.println("Constructor");
    }

    public A(int a){
        System.out.println("Constructor int A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B Constructor");
    }

    public  B(int a){
        this();
        System.out.println("B constructor int B");
    }
}