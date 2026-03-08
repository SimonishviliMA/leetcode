package ru.mikhail.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }


    private static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int l = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                addRange(result, l, nums[i - 1]);
                l = nums[i];
            }
        }
        addRange(result, l, nums[nums.length - 1]);
        return result;
    }

    private static void addRange(List<String> result, int l, int r) {
        StringBuilder range = new StringBuilder("" + l);
        if (l != r) {
            range.append("->");
            range.append(r);
        }
        result.add(range.toString());
    }
}
