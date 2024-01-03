package Loops;

public class Loops {
    // for
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello World " + i + " " + j);
            }
        }
// while
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World");
            i++;
        }
// do while
        int j = 6;
        do {
            System.out.println("Hello World Do while");
            j++;
        } while (j < 5);

        // for each
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();

        int [][] numbers2 = {{1, 2, 3}, {4, 5, 6}};
        for (int[] number : numbers2) {
            for (int number1 : number) {
                System.out.print(number1);
            }
        }
    }
}
