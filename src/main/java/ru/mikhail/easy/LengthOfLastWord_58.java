package ru.mikhail.easy;

public class LengthOfLastWord_58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char symb = s.charAt(i);
            if (symb >= 'A' && symb <= 'z') {
                result++;
            }
            if (result != 0 && (symb < 'A' || symb > 'z')) {
                return result;
            }
        }
        return result;
    }
}
