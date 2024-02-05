package OOP;

abstract class Abstraction {
    public abstract double calculateArea();
    public abstract void draw();
    void Write(){
        System.out.println("Write");
    }
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

public class WorkWithAbstraction {
    public static void main(String[] args) {
        Abstraction circle = new Circle(5);
        double area = circle.calculateArea();
        double roundedArea = Math.round(area * 100.0) / 100.0; // Round to two decimal places
        System.out.println(roundedArea);
        circle.draw();
        circle.Write();

    }
}
