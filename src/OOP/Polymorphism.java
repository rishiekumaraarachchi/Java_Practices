package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        Vehicle car = new Car1();
        Vehicle lorry = new Lorry();
        System.out.println(car.calculateFuelEfficiency(100, 10));
        System.out.println(lorry.calculateFuelEfficiency(100, 10, 2));
    }

}

class Vehicle {
    public double calculateFuelEfficiency(int miles, int gallons) {
        return (double)miles / gallons;
    }

    public double calculateFuelEfficiency(int miles, int gallons, int weight) {
        return (double)miles / (gallons * weight);
    }

}

class Car1 extends Vehicle {
    public double calculateFuelEfficiency(int miles, int gallons) {
        return super.calculateFuelEfficiency(miles, gallons);
    }


}

class Lorry extends Vehicle {
    public double calculateFuelEfficiency(int miles, int gallons, int weight) {
        return super.calculateFuelEfficiency(miles, gallons, weight);
    }
}

