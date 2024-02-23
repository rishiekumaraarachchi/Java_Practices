package Collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection <Integer> nums;
        nums = new ArrayList <>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums.size()+ " " + nums.isEmpty()+ " " + nums.contains(1));
        for(int num: nums) {
            System.out.println(num);
        }

        Set <Integer> nums2;
        nums2 = new HashSet<Integer>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);

        for (int num: nums2) {
            System.out.print(num + " ");
        }

        Map <String, Integer> nums3;
        nums3 = new HashMap <>();
        nums3.put("One", 1);
        nums3.put("Two", 2);
        nums3.put("Three", 3);

        System.out.println(nums3.get("One"));
    }

}
