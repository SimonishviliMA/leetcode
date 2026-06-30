package ru.mikhail.medium;

import ru.mikhail.utils.ListNode;

public class PartitionList_86 {

    public static void main(String[] args) {
        System.out.println(partition(ListNode.arrayToListNode(new int[]{1,4,3,2,5,2}), 3));
    }


    private static ListNode partition(ListNode head, int x) {
        ListNode res = new ListNode();
        ListNode left = res;
        ListNode rightStart = new ListNode();
        ListNode right = rightStart;
        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        left.next = rightStart.next;
        return res.next;
    }
}
