package ru.mikhail.easy;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class IntersectionOfTwoArraysII_350 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4})
        ));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, AtomicInteger> uniques1 = new HashMap<>();
        for (int num : nums1) {
            uniques1.computeIfAbsent(num, s -> new AtomicInteger(0)).incrementAndGet();
        }
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (uniques1.containsKey(num) && uniques1.get(num).get() > 0) {
                intersection.add(num);
                uniques1.get(num).decrementAndGet();
            }
        }
        int[] res = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            res[i++] = num;
        }
        return res;
    }
}
