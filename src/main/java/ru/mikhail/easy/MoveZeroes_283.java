package ru.mikhail.easy;

import java.util.Arrays;

public class MoveZeroes_283 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 2, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int shift = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[shift++] = num;
            }
        }
        for (int i = shift; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
