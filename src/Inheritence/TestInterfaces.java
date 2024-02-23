package Inheritence;

interface TestInterface {
    void method1();
    void method2();
}

abstract class AbstractClass implements TestInterface {
    @Override
    public void method1() {
        System.out.println("Default implementation of method1");
    }
}

class ConcreteClass extends AbstractClass {
    @Override
    public void method2() {
        System.out.println("Implementation of method2");
    }
}

public class TestInterfaces {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.method1(); // Output: Default implementation of method1
        obj.method2(); // Output: Implementation of method2
    }
}
