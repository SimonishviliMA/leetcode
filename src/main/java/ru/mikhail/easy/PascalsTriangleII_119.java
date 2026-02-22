package ru.mikhail.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII_119 {

    public static void main(String[] args) {
        System.out.println(getRow(6));
    }

    private static List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            dp[i][0] = 1;
            dp[0][i] = 1;
        }
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 1; j <= rowIndex - i; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
            result.add(dp[i][rowIndex - i]);
        }
        return result;
    }
}
