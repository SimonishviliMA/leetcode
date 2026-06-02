package ru.mikhail.easy;

import java.util.Arrays;

public class AssignCookies_541 {

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
