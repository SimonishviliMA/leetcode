package ru.mikhail.easy;

import java.util.Map;

public class RomanToInt_13 {

    private static final Map<Character, Integer> romanNumbers = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1_000
    );

    public static void main(String[] args) {
        System.out.println(romanToInt("MDCIXCII"));
    }

    private static int romanToInt(String s) {

        if (s == null || s.isBlank()) return 0;

        char[] sArr = s.toCharArray();
        int result = 0;
        int tempResult = 0;

        int c = romanNumbers.get(sArr[0]);
        for (int i = 0; i < sArr.length - 1; i++) {
            int n = romanNumbers.get(sArr[i + 1]);
            if (c > n) {
                result += c - tempResult;
                tempResult = 0;
            } else if (c < n) {
                tempResult = c - tempResult;
            } else {
                result += c;
            }
            c = n;
        }

        return result + romanNumbers.get(sArr[sArr.length - 1]) - tempResult;
    }
}
