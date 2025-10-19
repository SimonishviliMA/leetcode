package ru.mikhail.easy;

public class SingleNumber_136 {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3,0,1}));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
