package ru.mikhail.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public static void main(String[] args) {
        int[] nums = {-18,12,3,0};
        int target = -6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> needMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (needMap.containsKey(need)) {
                return new int[] {i, needMap.get(need)};
            }
            needMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
