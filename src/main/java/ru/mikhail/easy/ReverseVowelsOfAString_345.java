package ru.mikhail.easy;

public class ReverseVowelsOfAString_345 {

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }

    private static String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] sArr = s.toCharArray();
        while (i < j) {
            if (vowels[sArr[i]] && vowels[sArr[j]]) {
                char tmp = sArr[i];
                sArr[i] = sArr[j];
                sArr[j] = tmp;
                i++;
                j--;
            } else if (vowels[sArr[i]]) {
                j--;
            } else if (vowels[sArr[j]]) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(sArr);
    }
}
