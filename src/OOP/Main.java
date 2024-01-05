package OOP;

abstract class Abstraction {
    public abstract double calculateArea();
    public abstract void draw();
}

class Circle extends Abstraction { // concrete class
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Abstraction circle = new Circle(5);
        System.out.println(circle.calculateArea());
        circle.draw();
    }
}
