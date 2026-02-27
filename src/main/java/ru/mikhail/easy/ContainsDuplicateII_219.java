package ru.mikhail.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII_219 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> buffer = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) buffer.remove(nums[i - k - 1]);
            if (!buffer.add(nums[i])) return true;
        }
        return false;
    }
}
