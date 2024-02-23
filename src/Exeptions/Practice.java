package Exeptions;

public class Practice {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int [] nums= new int[5];

        try {
             j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            System.out.println(nums[2]);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye");
        }
    }


}
