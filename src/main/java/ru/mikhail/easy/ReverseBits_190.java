package ru.mikhail.easy;

public class ReverseBits_190 {

    public static void main(String[] args) {
        System.out.println(reverseBits(10));
    }

    private static int reverseBits(int n) {
        int pow = 31;
        int result = 0;
        while (n > 0) {
            result += Math.pow(n % 2 == 1 ? 2 : 0, pow--);
            n /= 2;
        }
        return result;
    }
}
