package ru.mikhail.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappySlowFast(19));
    }



    private static final Set<Integer> was = new HashSet<>();

    private static boolean isHappy(int n) {
        while(!was.contains(n) && n != 1) {
            was.add(n);
            int tmp = 0;
            while (n != 0) {
                int mod = n % 10;
                tmp += mod * mod;
                n /= 10;
            }
            n = tmp;
        }
        return n == 1;
    }


    private static boolean isHappySlowFast(int n) {
        int slow = getNextN(n);
        int fast = getNextN(slow);

        while (slow != fast && slow != 1) {
            slow = getNextN(slow);
            fast = getNextN(getNextN(fast));
        }

        return slow == 1;
    }


    private static int getNextN(int n) {
        int result = 0;
        while (n != 0) {
            int mod = n % 10;
            result += mod * mod;
            n /= 10;
        }
        return result;
    }
}
