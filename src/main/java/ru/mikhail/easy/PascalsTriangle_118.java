package ru.mikhail.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(
                        result.get(i - 1).get(j - 1) + (j != i - 1 ? result.get(i - 1).get(j) : 1)
                );
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }
}
