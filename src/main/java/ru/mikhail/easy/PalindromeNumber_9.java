package ru.mikhail.easy;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x <= 9) return true;
        int temp = x;
        int rev = 0;
        while(temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        return rev == x;
    }

}
