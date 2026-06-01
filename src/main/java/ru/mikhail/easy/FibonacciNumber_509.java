package ru.mikhail.easy;

public class FibonacciNumber_509 {

    public static void main(String[] args) {
        System.out.println(fib(3));
    }


    private static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] f = new int[n + 1];
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}
