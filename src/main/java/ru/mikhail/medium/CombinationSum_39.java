package ru.mikhail.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        depth(result, new ArrayList<>(), 0, 0, candidates, target);
        return result;
    }

    private static void depth(List<List<Integer>> result, List<Integer> comb, int sum, int i, int[] candidates, int target) {
        if (sum == target) {
            result.add(new ArrayList<>(comb));
            return;
        } else if (sum > target || i >= candidates.length) {
            return;
        }

        comb.add(candidates[i]);
        depth(result, comb, sum + candidates[i], i, candidates, target);

        comb.removeLast();
        depth(result, comb, sum, i + 1, candidates, target);
    }


}
