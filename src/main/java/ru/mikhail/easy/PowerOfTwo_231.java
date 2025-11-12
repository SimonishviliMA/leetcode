package ru.mikhail.easy;

public class PowerOfTwo_231 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwoF(1024));
        System.out.println(isPowerOfTwoS(1024));
    }

    //First Idea
    private static boolean isPowerOfTwoF(int n) {
        while (n != 1) {
            if (n < 1 || n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }

    //Coolest idea. 2 in any power will be equal 10.... that means previous value of n should be equal 01... . & operation of that equals 0
    private static boolean isPowerOfTwoS(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
