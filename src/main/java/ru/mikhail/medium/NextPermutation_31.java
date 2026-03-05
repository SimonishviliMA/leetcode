package ru.mikhail.medium;

import java.util.Arrays;

public class NextPermutation_31 {

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void nextPermutation(int[] nums) {

        if (nums.length < 1) return;

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i < 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        int j = nums.length - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }

        swap(nums, i, j);
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void reverse(int[] nums, int begin, int end) {
        while (begin < end) {
            swap(nums, begin++, end--);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
