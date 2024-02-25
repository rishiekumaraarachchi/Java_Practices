package OOP;

public class InterfacetoInterface {
    public static void main(String[] args) {
        Bird a= new Sparrow();
        a.eat();
        a.sleep();
        a.fly();
    }

}
// Parent interface
interface Animal {
    void eat();
    void sleep();

}

// Child interface extending the parent interface
interface Bird extends Animal {
    void fly();
}

// Concrete class implementing the child interface
class Sparrow implements Bird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
