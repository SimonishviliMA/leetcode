package ru.mikhail.easy;

public class UglyNumber_263 {

    private static final int[] factors = new int[] {2,3,5};

    public static void main(String[] args) {
        System.out.println(isUgly(10));
    }

    private static boolean isUgly(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        for (int factor : factors) {
            if (n % factor == 0) {
                return isUgly(n / factor);
            }
        }
        return false;
    }
}
