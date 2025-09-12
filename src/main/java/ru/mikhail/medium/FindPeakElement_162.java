package ru.mikhail.medium;

public class FindPeakElement_162 {

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[] {3,4,3,2,1}));
    }

    private static int findPeakElement(int[] nums) {
        if (nums.length <= 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        int l, r, m;
        l = 0;
        r = nums.length - 1;
        while(true) {
            m = (l + r) / 2;
            if (nums[m] > nums[m - 1] && nums[m] > nums[m + 1]) return m;
            if (nums[m] < nums[m + 1]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
    }

}
