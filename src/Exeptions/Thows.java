package Exeptions;

public class Thows {
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        A a = new A();
        try {
            a.show();
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Bye");
        }
    }
}

class A {
    public void show() throws ArithmeticException {
        System.out.println("Hello");

        // Example of throwing an ArithmeticException
        int result = 10 / 0; // This line will throw ArithmeticException
    }
}
