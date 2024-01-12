package Exeptions;

public class MyExeption {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            // Check for division by zero
            if (j == 0) {
                throw new OwnExeption("Divide by zero"); //creating a new instance of the ArithmeticException class and throwing it.
            }

            j = 18 / i;

           
        } catch (OwnExeption e) {
            System.out.println("Exeption " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Bye");
        }
    }
    
}

class OwnExeption extends Exception {
    public OwnExeption(String message) {
        super(message);
    }
   
}