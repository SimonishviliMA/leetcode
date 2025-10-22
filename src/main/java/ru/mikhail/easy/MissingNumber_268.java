package ru.mikhail.easy;

public class MissingNumber_268 {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
    }

    private static int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        return (n * (n + 1) / 2) - sum;
    }
}
