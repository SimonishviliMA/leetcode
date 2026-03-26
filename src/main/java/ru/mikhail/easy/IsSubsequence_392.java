package ru.mikhail.easy;

public class IsSubsequence_392 {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }


    private static boolean isSubsequence(String s, String t) {
        int slow = 0, fast = 0;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        while (slow < sArr.length && fast < tArr.length) {
            if (sArr[slow] == tArr[fast]) {
                slow++;
            }
            fast++;
        }
        return slow == sArr.length;
    }
}
