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

//public class Array {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.id = 1;
//        s1.name = "Nguyen Van A";
//        s1.age = 20;
//
//        Student s2 = new Student();
//        s2.id = 2;
//        s2.name = "Nguyen Van B";
//        s2.age = 21;
//
//        Student s3 = new Student();
//        s3.id = 3;
//        s3.name = "Nguyen Van C";
//
//        Student[] students = new Student[3];
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("ID: " + students[i].id);
//            System.out.println("Name: " + students[i].name);
//            System.out.println("Age: " + students[i].age);
//        }
//
//    }
//}
//
//class Student{
//    public int id;
//    public String name;
//    public int age;
//}