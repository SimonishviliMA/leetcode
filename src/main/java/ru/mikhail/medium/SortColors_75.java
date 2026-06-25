package ru.mikhail.medium;

import java.util.Arrays;

public class SortColors_75 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int r = nums.length - 1;
        while (m <= r) {
            switch (nums[m]) {
                case 0:
                    swap(nums, l, m);
                    l++;
                    m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(nums, m, r);
                    r--;
                    break;
            }
        }
    }

    private static void sortColorsWithinQuickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int begin, int end) {
        if (begin > end ) return;
        int pi = partition(nums, begin, end);

        quickSort(nums, begin, pi - 1);
        quickSort(nums, pi + 1, end);
    }

    private static int partition(int[] nums, int begin, int end) {
        int pivot = nums[end];
        int pi = begin - 1;
        for (int i = begin; i < end; i++) {
            if (nums[i] <= pivot) {
                swap(nums, i, ++pi);
            }
        }
        swap(nums, end, ++pi);
        return pi;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
