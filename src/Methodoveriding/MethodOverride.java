package Methodoveriding;

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Polymorphism
        animal.makeSound(); // Calls the overridden method in Dog
    }
}
