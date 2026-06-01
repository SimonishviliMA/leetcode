package ru.mikhail.easy;

public class MinCostClimbingStairs_746 {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }

    private static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[cost.length];
        for(int i = 2; i < cost.length; i++) {
            dp[i] = getMinCost(cost, dp, i);
        }
        return getMinCost(cost, dp, dp.length);
    }

    private static int getMinCost(int[] cost, int[] dp, int i) {
        return Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
    }
}
