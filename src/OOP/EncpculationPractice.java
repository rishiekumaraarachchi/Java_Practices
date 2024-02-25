package OOP;

public class EncpculationPractice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rishie");
        System.out.println("student name " + s1.getName());
    }
}

class Student {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}