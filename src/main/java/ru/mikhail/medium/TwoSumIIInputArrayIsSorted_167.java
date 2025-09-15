package ru.mikhail.medium;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted_167 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int l, r;
        l = 0;
        r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                return new int[]{l + 1, r + 1};
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[2];
    }
}
