package Collections;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("John", 1);
        students.put("Jane", 2);
        students.put("Jack", 3);
        students.put("Jill", 4);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key+" : " +students.get(key));
        }
    }
}
