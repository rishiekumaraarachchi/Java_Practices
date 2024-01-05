package LamdaExpression;

@FunctionalInterface
interface Calc {
    int add(int a, int b);
}

public class Demo {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;

//        Calc calc = new Calc() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };

//        Calc calc = (int x, int y) -> {
//            return x + y;
//        };

//        Calc calc = (x, y) -> {
//            return x + y;
//        };

        Calc calc = (x, y) -> x + y;
        System.out.println(calc.add(a, b));
        }
    }
