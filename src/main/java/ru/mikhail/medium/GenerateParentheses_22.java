package ru.mikhail.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

    private static final char OPEN = '(';
    private static final char CLOSE = ')';

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisRec(result, n, 0, 0, new StringBuilder());
        return result;
    }

    private static void generateParenthesisRec(List<String> result, int n, int i, int j, StringBuilder path) {
        if (i + j == n * 2) {
            result.add(path.toString());
            return;
        }
        if (i < n) {
            generateParenthesisRec(result, n, i + 1, j, path.append(OPEN));
            path.deleteCharAt(path.length() - 1);
        }
        if (j < i) {
            generateParenthesisRec(result, n, i, j + 1, path.append(CLOSE));
            path.deleteCharAt(path.length() - 1);
        }
    }
}
