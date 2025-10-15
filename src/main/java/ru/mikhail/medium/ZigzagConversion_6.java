package ru.mikhail.medium;

public class ZigzagConversion_6 {

    public static void main(String[] args) {
        System.out.println(convert("paypalishiring", 3));
    }


    private static String convert(String s, int numRows) {

        int sLength = s.length();
        if (numRows == 1 || numRows >= sLength) return s;

        int k = 0;
        int del = 2 * (numRows - 1);

        char[] c = s.toCharArray();
        char[] result = new char[sLength];

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < sLength; j += del) {
                result[k++] = c[j];
                int l = j + del - 2 * i;
                if (i != 0 && i != numRows - 1 && l < sLength) {
                    result[k++] = c[l];
                }
            }
        }
        return new String(result);
    }
}
