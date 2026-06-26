package ru.mikhail.medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII_80 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = removeDuplicates(nums);
        System.out.println(k + " : " + Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
