package Inheritence;

public class Demo {
    public static void main(String[] args) {
        AdvanceCalc calc = new AdvanceCalc();
        int r1 = calc.add(8,9);
        int r2 = calc.sub(6,5);
        int r3 = calc.division(5,6);
        int r4 = calc.multi(3,2);
        double r5 = calc.power(5.0,6.0);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }
}

class Calc{
    public int add(int x, int y){

        return x+y;
    }
    public int sub (int x, int y){

        return x-y;
    }

    public void show(){
    }
}

class AdvanceCalc extends Calc{
    public int multi(int x, int y){

        return x*y;
    }
    public int division(int x, int y ){

        return x/y;
    }

    public double power(double x, double y){
        return Math.pow(x,y);
    }
}