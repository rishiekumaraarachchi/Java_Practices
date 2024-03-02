package Exeptions;

public class OwnException extends Exception {

    public OwnException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            if (i == 0) {
                throw new OwnException("Divide by Zero");
            }
            j = 18 / i; // This line should be after the check
            System.out.println(j);
        } catch (OwnException e) {
            System.out.println(e.getMessage()); // Print the custom message
        }
    }
}

