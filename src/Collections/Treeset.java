package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet();
        nums.add(10);
        nums.add(50);
        nums.add(20);
        nums.add(30);
        nums.add(20);

//        for (int num : nums) {
//            System.out.println(num);
//        }

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
