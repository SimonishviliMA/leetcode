package ru.mikhail.easy;

public class SqrtX_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }


    private static int mySqrt(int x) {
        if (x <= 1) return x;
        long closest, current;
        closest = 1;
        long r = x;
        long l = 0L;
        while (true) {
            current = (l + r) / 2;
            long sqr = current * current;
            if (sqr == x) {
                return (int) current;
            } else if (sqr < x) {
                closest = Math.max(current, closest);
                if (r - l == 1 || r == l) return (int) closest;
                l = current;
            } else {
                if (r - l == 1 || r == l) return (int) closest;
                r = current;
            }
        }
    }
}
