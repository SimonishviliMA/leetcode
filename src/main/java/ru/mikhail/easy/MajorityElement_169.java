package ru.mikhail.easy;

public class MajorityElement_169 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }


    private static int majorityElement(int[] nums) {
        int result = 0;
        int majority = 0;

        for (int num : nums) {
            if (majority == 0) {
                result = num;
            }

            majority += num == result ? 1 : -1;
        }

        return result;
    }

}
