public class Construct {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.name = "Iphone 12";
        m1.price = 1000;
        Mobile.brand = "Apple";

        Mobile m2 = new Mobile();
        m2.name = "Iphone 11";
        m2.price = 900;
        Mobile.brand = "Apple";

        Mobile m3 = new Mobile();

        m1.showInfo();
        m2.showInfo();
        m3.showInfo();
    }

}

class Mobile{
    String name;
    int price;
    static String brand;

    static {
        brand = "Phone";
        System.out.println("Static block");
    }

    public Mobile(){
        name = "Iphone 14";
        price = 1400;
        System.out.println("Constructor");
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
    }
}