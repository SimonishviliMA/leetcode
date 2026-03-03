package ru.mikhail.easy;

public class NumberOf1Bits_191 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(2147483645));
    }

    private static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 2 == 1 ? 1 : 0;
            n /= 2;
        }
        return count;
    }
}
