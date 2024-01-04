package Constructor;

public class Cons {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.showInfo();

        Human h2 = new Human(20, "Nguyen Van A");
        h2.showInfo();

        Human h3 = new Human(20);
        h3.showInfo();

        Human h4 = new Human("Nguyen Van A");
        h4.showInfo();

    }

}

class Human{
    private int age;
    private String name;

    public Human(){
        System.out.println("Constructor");
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Human(int age){
        this.age = age;
    }

    public Human(String name){
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}