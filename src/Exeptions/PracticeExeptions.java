package Exeptions;

public class  PracticeExeptions  {

    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            int i = 18 / 0; // This line will throw an ArithmeticException
            System.out.println(arr[5]); // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        }
    }
}
