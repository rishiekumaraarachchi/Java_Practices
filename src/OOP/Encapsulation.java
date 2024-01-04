package OOP;

class Human{
private int age;
private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Human h = new Human();
        h.setAge(20);
        h.setName("Nguyen Van A");
        System.out.println("Age: " + h.getAge());
        System.out.println("Name: " + h.getName());
    }
}