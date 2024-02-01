package Casting;

public class Casting {
    public static void main(String[] args) {
//        byte b= 127;
//        int a = 12;
//        b = (byte) a; // Casting
        int a = 257;
        byte b = (byte) a;
        float f = 3.14f;
        int i = (int) f;
        int c = 3;
        System.out.println(i);
        System.out.println(b);
        int result = c++; // first assign then increment
        System.out.println(result);
        System.out.println(c);
        int result2 = ++c; // first increment then assign
        System.out.println(result2);

    }
}
