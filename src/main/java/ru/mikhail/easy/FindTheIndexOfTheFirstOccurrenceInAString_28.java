package ru.mikhail.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString_28 {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
    }

    private static int strStr(String haystack, String needle) {
        if (haystack.isBlank() || needle.isBlank()) return -1;
        if (haystack.equals(needle)) return 0;
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int i = 0;
        int j = 0;
        int result = -1;
        boolean inProcess = false;
        while (i < haystackArr.length || (i < haystackArr.length - needleArr.length + 1 && j == 0)) {
            if (haystackArr[i] == needleArr[j]) {
                if (j == 0) {
                    result = i;
                }
                if (j == needleArr.length - 1) {
                    return result;
                }
                j++;
                inProcess = true;
            } else {
                j = 0;
                if (inProcess) {
                    i = result;
                    inProcess = false;
                }
            }
            i++;
        }
        return -1;
    }
}
