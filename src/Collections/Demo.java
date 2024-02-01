package Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Collection <Integer> nums = new ArrayList <Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums.size()+ " " + nums.isEmpty()+ " " + nums.contains(1));
        for(int num: nums) {
            System.out.println(num);
        }

        Set <Integer> nums2 = new java.util.HashSet <Integer>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(3);

        for (int num: nums2) {
            System.out.println(num);
        }
    }

}
