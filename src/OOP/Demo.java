package OOP;

public class Demo {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        Calc calc = new Calc();
        int result = calc.add(a, b);
        System.out.println(result);
    }
}

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}