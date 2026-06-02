package ru.mikhail.easy;

public class ReverseStringII_541 {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    private static String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int i = 0;
        while (i < c.length) {
            reverse(c, i, i + k - 1);
            i += 2 * k;
        }
        return String.valueOf(c);
    }

    private static void reverse(char[] c, int start, int end) {
        if (end >= c.length) end = c.length - 1;
        while (start < end) {
            char tmp = c[start];
            c[start] = c[end];
            c[end] = tmp;
            start++;
            end--;
        }
    }
}
