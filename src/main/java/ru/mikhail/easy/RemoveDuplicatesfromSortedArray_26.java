package ru.mikhail.easy;

public class RemoveDuplicatesfromSortedArray_26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }


    private static int removeDuplicates(int[] nums) {
        int j = 1;
        int prev = nums[0];
        int k = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                k--;
            } else {
                prev = nums[i];
                nums[j++] = nums[i];
            }
        }
        return k;
    }
}
