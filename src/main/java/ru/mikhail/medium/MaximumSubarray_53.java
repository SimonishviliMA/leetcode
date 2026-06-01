package ru.mikhail.medium;

public class MaximumSubarray_53 {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    private static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int tmp = 0;
        for (int num : nums) {
            if (tmp < 0) {
                tmp = 0;
            }

            tmp += num;
            sum = Math.max(sum, tmp);
        }

        return sum;
    }
}
