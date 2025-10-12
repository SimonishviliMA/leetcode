package ru.mikhail.easy;

public class ValidPalindrome_125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ab_a"));
    }


    public static boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty()) return true;

        char[] c = s.toCharArray();

        int i = 0;
        int j = c.length - 1;

        while (i <= j) {
            while (i <= j && !check(c[i])) {
                i++;
            }
            while(i <= j && !check(c[j])) {
                j--;
            }
            if (i > j) return true;
            if (Character.toLowerCase(c[i]) != Character.toLowerCase(c[j])) return false;
            i++;
            j--;
        }
        return true;
    }

    private static boolean check(char c) {
        return  (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
