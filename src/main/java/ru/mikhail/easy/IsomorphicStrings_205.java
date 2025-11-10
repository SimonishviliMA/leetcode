package ru.mikhail.easy;

public class IsomorphicStrings_205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    private static boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256];
        int[] tMap = new int[256];
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (int i = 0; i < sArr.length; i++) {
            if (sMap[sArr[i]] == 0 && tMap[tArr[i]] == 0) {
                sMap[sArr[i]] = tArr[i];
                tMap[tArr[i]] = sArr[i];
            } else if (sMap[sArr[i]] != tArr[i] || tMap[tArr[i]] != sArr[i]) return false;
        }
        return true;
    }
}
