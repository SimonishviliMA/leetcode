package ru.mikhail.medium;

public class AddTwoNumbers_2 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode tmpL1 = l1;
        ListNode l2 = new ListNode();
        ListNode tmpL2 = l2;

        int[] l1Arr = new int[]{2,4,3};
        int[] l2Arr = new int[]{5,6,4};

        for (int j = 0; j < l1Arr.length; j++) {
            tmpL1.val = l1Arr[j];
            if (j != l1Arr.length - 1) {
                tmpL1.next = new ListNode();
                tmpL1 = tmpL1.next;
            }
        }

        for (int j = 0; j < l2Arr.length; j++) {
            tmpL2.val = l2Arr[j];
            if (j != l2Arr.length - 1) {
                tmpL2.next = new ListNode();
                tmpL2 = tmpL2.next;
            }
        }

        System.out.println(addTwoNumbers(l1, l2));
    }


    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tmp = result;
        boolean extra = false;
        int n1 = 0;
        int n2 = 0;
        while (l1 != null || l2 != null || extra) {

            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }

            int sum = n1 + n2 + (extra ? 1 : 0);

            if (sum > 9) {
                extra = true;
                sum -= 10;
            } else {
                extra = false;
            }

            tmp.val = sum;
            if (l1 != null || l2 != null || extra) {
                tmp.next = new ListNode();
                tmp = tmp.next;
            }

            n1 = 0;
            n2 = 0;
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return val + "" + next;
        }
    }
}
