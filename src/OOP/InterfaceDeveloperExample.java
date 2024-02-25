package OOP;

interface Computer{
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Laptop Code");
    }
}

class Desktop implements Computer{
    public void code() {
        System.out.println("Desktop Code Faster");
    }
}


class Developer {
    private final Computer com;

    public Developer(Computer com) {
        this.com=com;
    }

    public void develop() {
        com.code();
    }

}

public class InterfaceDeveloperExample {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer destop = new Desktop();
        Developer rishie = new Developer(laptop);
        Developer sahan = new Developer(destop);
        rishie.develop();
        sahan.develop();
    }
}
