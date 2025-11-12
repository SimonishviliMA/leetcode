package ru.mikhail.easy;

public class ValidAnagram_242 {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    private static boolean isAnagram(String s, String t) {
        int length = s.length();
        if (length != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] counter = new int[26];
        for (int i = 0; i < length; i++) {
            counter[sArr[i] - 'a']++;
            counter[tArr[i] - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) return false;
        }
        return true;
    }

}
