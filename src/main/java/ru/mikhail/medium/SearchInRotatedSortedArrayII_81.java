package ru.mikhail.medium;

public class SearchInRotatedSortedArrayII_81 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,0,1,1,1}, 0));
    }


    private static boolean search(int[] nums, int target) {
        int i, l = 0, r = nums.length - 1;
        while(l <= r) {
            i = (l + r) / 2;
            if (nums[i] == target || nums[l] == target || nums[r] == target) {
                return true;
            }
            if (nums[l] == nums[r] && nums[r] == nums[i]) {
                l++;
                r--;
                continue;
            }
            if (nums[l] <= nums[i]) {
                if (target > nums[l] && target < nums[i]) {
                    r = i - 1;
                } else {
                    l = i + 1;
                }
            } else {
                if (target > nums[i] && target < nums[r]) {
                    l = i + 1;
                } else {
                    r = i - 1;
                }
            }
        }
        return false;
    }
}
