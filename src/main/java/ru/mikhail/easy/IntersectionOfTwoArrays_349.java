package ru.mikhail.easy;

import java.util.*;

public class IntersectionOfTwoArrays_349 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                intersection(new int[] {1,2,2,1}, new int[] {2,2})
        ));
    }


    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums1) {
            unique.add(num);
        }
        for (int num : nums2) {
            if (unique.contains(num)) {
                intersection.add(num);
            }
        }

        int[] res = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            res[i++] = num;
        }
        return res;
    }
}
