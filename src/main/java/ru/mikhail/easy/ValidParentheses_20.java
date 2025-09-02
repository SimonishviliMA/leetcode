package ru.mikhail.easy;

import java.util.Map;

public class ValidParentheses_20 {

    private static final Map<Character, Character> opCl = Map.of(
            '(', ')',
            '{', '}',
            '[', ']'
    );

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    private static boolean isValid(String s) {
        if (s == null || s.trim().isEmpty()) return true;
        if (s.length() % 2 != 0) return false;
        char[] cArr = s.toCharArray();
        int length = cArr.length;
        int mid = length / 2;
        int opCount = 0;
        int clCount = 0;
        char[] ops = new char[mid];
        int j = 0;
        for (char c : cArr) {
            if (opCl.containsKey(c)) {
                if (++opCount > mid) return false;
                ops[j++] = c;
            } else {
                j--;
                if (++clCount > mid || j < 0) return false;
                if (!opCl.get(ops[j]).equals(c)) return false;
            }
        }
        return true;
    }
}
