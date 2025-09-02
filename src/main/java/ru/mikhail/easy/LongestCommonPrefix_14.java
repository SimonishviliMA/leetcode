package ru.mikhail.easy;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"","b"}));
    }


    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = strs[0];
        if (result == null || result.trim().isEmpty()) return "";
        int i = 1;
        while (i < strs.length && !result.trim().isEmpty()) {
            String next = strs[i++];
            int j = 0;
            char[] resArr = result.toCharArray();
            char[] nextArr = next.toCharArray();
            while (j < resArr.length && j < nextArr.length) {
                if (resArr[j] != nextArr[j]) break;
                j++;
            }
            result = result.substring(0,j);
        }
        return result;
    }
}
