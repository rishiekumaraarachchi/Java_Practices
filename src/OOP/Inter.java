package OOP;

public class Inter {
    public static void main(String[] args) {
        Car car = new Wagon();
        car.a();
        System.out.println( Car.a);
       
    }
}

interface Car {
    int a = 1;
    String b = "b";
    void a();
}

class Wagon implements Car {
    public void a() {
        System.out.println("a");
    }

    public void b() {
        System.out.println("b");
    }
}
