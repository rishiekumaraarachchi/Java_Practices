package Array;

public class Array {
    public static void main(String[] args) {
       int [] arr = new int[5];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = i;
         }
            for (int i : arr) {
                System.out.print(i);
            }

            int [][] arr2 = new int[5][5];
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    arr2[i][j] = i + j;
                }
            }
            System.out.println();
            for (int [] arr3 : arr2){
                for (int i : arr3) {
                    System.out.print(i + " ");

                }
                System.out.println();
            }

    }

}
