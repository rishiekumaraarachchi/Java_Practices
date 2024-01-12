package Exeptions;
public class Demo {
    public static void main (String [] args){
        int i =5;
        int j=0;

        int [] arr = new int[5];

        try{
            j = 18/i;
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Something went wrong " + e.getMessage());
        }
        finally {
            System.out.println("Bye");
        }
    }
}
