package ru.mikhail.easy;

public class FindTheDifference_389 {

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

    private static char findTheDifference(String s, String t) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return (char) res;
    }
}
