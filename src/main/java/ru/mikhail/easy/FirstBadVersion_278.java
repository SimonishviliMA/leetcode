package ru.mikhail.easy;

import ru.mikhail.utils.VersionControl;

public class FirstBadVersion_278 extends VersionControl {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

    private static int firstBadVersion(int n) {
        int i = 0, j = n;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (isBadVersion(mid)) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
}
