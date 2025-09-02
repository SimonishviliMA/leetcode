package ru.mikhail.easy;

public class RemoveElement_27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }

    private static int removeElement(int[] nums, int val) {
        int j = 0;
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k--;
            } else {
                nums[j++] = nums[i];
            }
        }
        return k;
    }
}
