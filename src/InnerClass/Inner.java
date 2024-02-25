package InnerClass;

class A{
    public void show(){
        System.out.println("In show");
    }
}

public class Inner {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In New Show");
            }
        };
        obj.show();
    }
}
